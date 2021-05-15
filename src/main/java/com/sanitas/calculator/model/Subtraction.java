package com.sanitas.calculator.model;

import java.math.BigDecimal;

/**
 * 
 * @author csanchez Subtraction type of Operation
 *
 */
public class Subtraction implements Operation {

	@Override
	public BigDecimal execute(BigDecimal num1, BigDecimal num2) {
		return num1.subtract(num2);
	}

}
