package com.iemr.ecd.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

@Configuration
public class RedisConfig {

	private @Value("${spring.redis.host}") String redisHost;
	private @Value("${spring.redis.port}") int redisPort;

	@Bean
	LettuceConnectionFactory lettuceConnectionFactory() {
		return new LettuceConnectionFactory(redisHost, redisPort);
	}

}
