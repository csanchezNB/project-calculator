package com.sanitas.calculator.service;

import java.math.BigDecimal;

public interface CalculatorService {

	BigDecimal executeAddition(BigDecimal num1, BigDecimal num2);
	
	BigDecimal executeSubtraction(BigDecimal num1, BigDecimal num2);
}
