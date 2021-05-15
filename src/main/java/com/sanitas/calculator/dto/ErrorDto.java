package com.sanitas.calculator.dto;

import lombok.Data;

/**
 * @author csanchez DTO for parsing a generic error
 */
@Data
public class ErrorDto {

	private String error;

	private String errorDescription;

	private String timestamp;

	private int status;
}
