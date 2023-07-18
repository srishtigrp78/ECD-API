package com.iemr.ecd.utils.advice.exception_handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class EcdGlobalExceptionHandler extends ResponseEntityExceptionHandler {

	Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	@ExceptionHandler
	public CustomExceptionResponse handleInvalidRequestParameterException(InvalidRequestException e) {
		logger.error("invalid request exception : " + e);
		CustomExceptionResponse customExceptionResponse = new CustomExceptionResponse();
		customExceptionResponse.setError(e);

		return customExceptionResponse;

	}

	@ExceptionHandler
	public CustomExceptionResponse handleGeneralException(ECDException e) {
		logger.error("ECD exception : " + e);
		CustomExceptionResponse customExceptionResponse = new CustomExceptionResponse();
		customExceptionResponse.setError(e);

		return customExceptionResponse;
	}

}
