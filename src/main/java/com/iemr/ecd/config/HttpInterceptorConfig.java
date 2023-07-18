package com.iemr.ecd.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.iemr.ecd.utils.http_request_interceptor.HttpInterceptor;

@Configuration
public class HttpInterceptorConfig implements WebMvcConfigurer {

	@Autowired
	private HttpInterceptor httpInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(httpInterceptor);
	}
}
