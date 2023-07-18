package com.iemr.ecd.utils.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisStringCommands.SetOption;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.types.Expiration;
import org.springframework.stereotype.Component;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Component
public class RedisStorage {

	@Autowired
	private LettuceConnectionFactory connection;

	Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

	private @Value("${iemr.session.expiry.time.sec}") int sessionExpiryTimeInSec;

	public String getSessionObject(String key) throws Exception {

		RedisConnection redisCon = connection.getConnection();
		byte[] sessionData = redisCon.stringCommands().get(key.getBytes());
		String userRespFromRedis = null;
		if (sessionData != null) {
			userRespFromRedis = new String(sessionData);
		}
		if ((userRespFromRedis != null) && (userRespFromRedis.trim().length() != 0)) {

		} else {
			throw new Exception(
					"Unable to fetch session object from Redis server,either session key is invalid or expired.");
		}

		return userRespFromRedis;
	}

	public String updateSessionObject(String key) throws Exception {
		RedisConnection redisCon = connection.getConnection();

		byte[] sessionData = redisCon.stringCommands().get(key.getBytes());

		if ((sessionData != null) && sessionData.length > 0) {
			logger.info("updating session time in redis for " + key);
			redisCon.stringCommands().set(key.getBytes(), sessionData, Expiration.seconds(sessionExpiryTimeInSec),
					SetOption.UPSERT);
		} else {
			throw new Exception("Unable to fetch session object from Redis server");
		}

		return key;
	}

	public void updateConcurrentSessionObject(String value) {
		try {
			JsonObject jsnOBJ = new JsonObject();

			JsonParser jsnParser = new JsonParser();
			JsonElement jsnElmnt = jsnParser.parse(value);
			jsnOBJ = jsnElmnt.getAsJsonObject();
			logger.info("updating con-current key:" + jsnOBJ.get("userName"));
			if (jsnOBJ.has("userName") && jsnOBJ.get("userName") != null) {
				updateSessionObject(jsnOBJ.get("userName").getAsString().trim().toLowerCase());
			}
		} catch (Exception e) {

		}
	}
}
