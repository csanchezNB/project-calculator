package com.sanitas.calculator.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.sanitas.calculator.model.Operation;
import com.sanitas.calculator.service.CalculatorService;

/**
 * 
 * Implementation of Service layer
 *
 */
@Component
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public BigDecimal execute(final BigDecimal num1, final BigDecimal num2, final Operation operation) {
		return operation.execute(num1, num2);
	}

}
