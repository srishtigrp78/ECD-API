package com.iemr.ecd.utils.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.google.gson.ExclusionStrategy;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

/**
 * @author VI314759
 *
 */
/**
 * @author VI314759
 *
 */
@Service
public class InputMapper {
	static GsonBuilder builder;
	ExclusionStrategy strategy;
	Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
	// @Autowired
	// ConfigProperties configProperties;

	// @Autowired
	// SessionObject sessionObject;

	// public void setSessionObject(SessionObject sessionObject)
	// {
	// this.sessionObject = sessionObject;
	// }

	public InputMapper() {
		if (builder == null) {
			builder = new GsonBuilder();
			builder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
			// builder.addDeserializationExclusionStrategy(strategy)
		}
	}

	/**
	 * @return
	 */
	public static InputMapper gson() {
		return new InputMapper();
	}

	/**
	 * @param json
	 * @param classOfT
	 * @return
	 * @throws Exception
	 */
	public <T> T fromJson(String json, Class<T> classOfT) throws Exception {
		return builder.create().fromJson(json, classOfT);
	}

	public <T> T fromJson(JsonElement json, Class<T> classOfT) throws Exception {
		return builder.create().fromJson(json, classOfT);
	}

	/**
	 * @param json
	 * @throws Exception This function will check for the following things and
	 *                   throws login exception if any one fails 1. Get the session
	 *                   details from the redis 2. IP address in request and the
	 *                   logged in IP address should be same.
	 */
	// private void valildate(String json) throws Exception
	// {
	// Object obj = new JsonParser().parse(json);
	// try
	// {
	// if (obj instanceof JsonObject)
	// {
	// JSONObject reqObj = new JSONObject(json);
	// String key = reqObj.getString("key");
	// // Validator.checkKeyExists(key);
	// } else if (obj instanceof JsonObject)
	// {
	// // to do
	// } else
	// {
	// // throw new Exception("Invalid login key");
	// logger.info("Invalid login key");
	// }
	// } catch (Exception e)
	// {
	// // throw new Exception("Invalid login key");
	// logger.info("Invalid login key");
	// }
	// }
}