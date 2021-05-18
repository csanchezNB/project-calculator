package com.sanitas.calculator.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * General response exception
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GeneralResponseException extends RuntimeException {

	private static final long serialVersionUID = -339505286053188424L;

	private final String error;

	private final String errorDescription;

	private final HttpStatus status;

	public GeneralResponseException(final HttpStatus status, final String error, final String errorDescription) {
		super();
		this.error = error;
		this.errorDescription = errorDescription;
		this.status = status;

	}	
	

}
