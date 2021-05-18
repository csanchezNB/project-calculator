package com.sanitas.calculator.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * DTO for parsing a generic error
 */
@Getter
@Setter
public class ErrorDto {

	private String error;

	private String errorDescription;

	private String timestamp;

	private int status;
}
