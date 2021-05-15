package com.sanitas.calculator.service;

import java.math.BigDecimal;

import com.sanitas.calculator.model.Operation;

public interface CalculatorService {

	BigDecimal executeAddition(BigDecimal num1, BigDecimal num2);
	
	BigDecimal executeSubtraction(BigDecimal num1, BigDecimal num2);

	BigDecimal execute(BigDecimal num1, BigDecimal num2, Operation operator);
}
