package com.iemr.ecd.utils.http_request_interceptor;

import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.iemr.ecd.utils.advice.exception_handler.CustomExceptionResponse;
import com.iemr.ecd.utils.redis.RedisStorage;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class HttpInterceptor implements HandlerInterceptor {
	Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	@Autowired
	private RedisStorage redisStorage;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		logger.info("http interceptor - pre Handle");
		boolean status = true;

		if (request.getRequestURI().toLowerCase().contains("swagger-ui"))
			return status;

		String authorization = request.getHeader("Authorization");
		if (!request.getMethod().equalsIgnoreCase("OPTIONS")) {
			try {
				String[] requestURIParts = request.getRequestURI().split("/");
				String requestAPI = requestURIParts[requestURIParts.length - 1];
				switch (requestAPI) {
				case "swagger-ui.html":
					break;
				case "index.html":
					break;
				case "swagger-initializer.js":
					break;
				case "swagger-config":
					break;
				case "ui":
					break;
				case "swagger-resources":
					break;
				case "api-docs":
					break;

				case "error":
					status = false;
					break;
				default:
					logger.debug("RequestURI::" + request.getRequestURI() + " || Authorization ::" + authorization);
					if (authorization == null)
						throw new Exception(
								"Authorization key is NULL, please pass valid session key to proceed further. ");
					String userRespFromRedis = redisStorage.getSessionObject(authorization);
					if (userRespFromRedis == null)
						throw new Exception("invalid Authorization key, please pass a valid key to proceed further. ");
					break;
				}
			} catch (Exception e) {
				logger.error(e.getLocalizedMessage());

				CustomExceptionResponse output = new CustomExceptionResponse();
				output.setError(5002, e.getLocalizedMessage());
				response.getOutputStream().print(output.toString());

				response.setContentType(MediaType.APPLICATION_JSON);

				// response.setContentLength(e.getLocalizedMessage().length());
				response.setHeader("Access-Control-Allow-Origin", "*");
				status = false;
			}
		}

		return status;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView model)
			throws Exception {
		logger.info("http interceptor - post Handle");
		try {

			String authorization = request.getHeader("Authorization");
			logger.debug("RequestURI::" + request.getRequestURI() + " || Authorization ::" + authorization);
			if (authorization != null) {
				redisStorage.updateConcurrentSessionObject(redisStorage.getSessionObject(authorization));
				redisStorage.updateSessionObject(authorization);
			}
		} catch (Exception e) {
			logger.error("postHandle failed with error " + e.getMessage());
		}

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception arg3)
			throws Exception {
		logger.info("http interceptor - after completion");

	}

}
