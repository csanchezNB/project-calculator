package com.sanitas.calculator.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

/**
 * 
 * Interface with the general execute method
 *
 */
@Component
public interface Operation {
	public Boolean canExecute(final String operator);
	public BigDecimal execute(final BigDecimal num1, final BigDecimal num2);
}
