package com.sanitas.calculator.model;

import java.math.BigDecimal;

/**
 * 
 * @author csanchez Addition type of Operation
 *
 */
public class Addition implements Operation {

	@Override
	public BigDecimal execute(final BigDecimal num1, final BigDecimal num2) {
		return num1.add(num2);
	}

}
