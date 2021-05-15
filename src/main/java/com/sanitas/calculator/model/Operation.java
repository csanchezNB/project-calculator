package com.sanitas.calculator.model;

import java.math.BigDecimal;

/**
 * 
 * @author csanchez Interface with the general execute method
 *
 */
public interface Operation {
	public BigDecimal execute(BigDecimal num1, BigDecimal num2);
}
