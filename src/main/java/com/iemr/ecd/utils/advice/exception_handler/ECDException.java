package com.iemr.ecd.utils.advice.exception_handler;

import org.springframework.stereotype.Component;

@Component
public class ECDException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ECDException() {
		super();
	}

	public ECDException(String exceptionMsg) {
		super("Exception Occurred: " + exceptionMsg);
	}

	public ECDException(Throwable cause) {
		super(cause);
	}

}
