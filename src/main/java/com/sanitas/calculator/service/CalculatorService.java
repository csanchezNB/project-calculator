package com.sanitas.calculator.service;

import java.math.BigDecimal;

import com.sanitas.calculator.model.Operation;

/**
 * 
 * Service layer
 *
 */
public interface CalculatorService {

	BigDecimal execute(final BigDecimal num1, final BigDecimal num2, final String operator);
}
