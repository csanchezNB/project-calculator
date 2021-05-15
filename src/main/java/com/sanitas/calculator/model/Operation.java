package com.sanitas.calculator.model;

import java.math.BigDecimal;

public interface Operation {
	public BigDecimal execute(BigDecimal num1, BigDecimal num2);
}
