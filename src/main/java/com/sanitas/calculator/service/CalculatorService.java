package com.sanitas.calculator.service;

import java.math.BigDecimal;

import com.sanitas.calculator.model.Operation;

/**
 * 
 * @author csanchez Service layer
 *
 */
public interface CalculatorService {

	BigDecimal execute(BigDecimal num1, BigDecimal num2, Operation operator);
}
