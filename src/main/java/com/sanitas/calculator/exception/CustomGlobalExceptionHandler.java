package com.sanitas.calculator.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sanitas.calculator.dto.ErrorDto;
import com.sanitas.calculator.utils.Constants;

/**
 * Global exception Handling
 *
 */
@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * Handle GeneralResponseException throwed
	 * 
	 * @param ex
	 * @param request
	 * @return ResponseEntity<Object> ErrorDto
	 */
	@ExceptionHandler(value = { GeneralResponseException.class })
	protected ResponseEntity<Object> handleConflict(final GeneralResponseException ex, final WebRequest request) {
		final ErrorDto errorDto = new ErrorDto();
		errorDto.setError(ex.getError());
		errorDto.setStatus(ex.getStatus().value());

		final Date date = new Date();
		final SimpleDateFormat sdf = new SimpleDateFormat(Constants.MASK_DATE_COMPLETE_JSON_ES);
		errorDto.setTimestamp(sdf.format(date));
		errorDto.setErrorDescription(ex.getErrorDescription());
		return handleExceptionInternal(ex, errorDto, new HttpHeaders(), ex.getStatus(), request);
	}

}