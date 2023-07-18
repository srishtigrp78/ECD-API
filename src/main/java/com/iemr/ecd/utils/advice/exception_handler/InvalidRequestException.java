package com.iemr.ecd.utils.advice.exception_handler;

import org.springframework.stereotype.Component;

@Component
public class InvalidRequestException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidRequestException() {
		super();
	}

	public InvalidRequestException(String errorMsg) {

		super("invalid request data. " + errorMsg);
	}

	public InvalidRequestException(String requestParam, String errorMsg) {

		super("invalid request data. " + requestParam + " " + errorMsg);
	}

	public InvalidRequestException(Throwable cause) {
		super(cause);
	}
}
