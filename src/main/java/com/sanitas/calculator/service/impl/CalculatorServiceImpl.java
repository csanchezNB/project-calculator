package com.sanitas.calculator.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.sanitas.calculator.service.CalculatorService;

@Component
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public BigDecimal executeAddition(BigDecimal num1, BigDecimal num2) {
		return num1.add(num2);
	}

	@Override
	public BigDecimal executeSubtraction(BigDecimal num1, BigDecimal num2) {
		return num1.subtract(num2);
	}

}
