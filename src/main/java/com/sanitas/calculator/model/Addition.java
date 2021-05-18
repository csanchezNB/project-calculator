package com.sanitas.calculator.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.sanitas.calculator.utils.Constants;

/**
 * 
 * Addition type of Operation
 *
 */
@Component
public class Addition implements Operation {

	@Override
	public BigDecimal execute(final BigDecimal num1, final BigDecimal num2) {
		return num1.add(num2);
	}

	@Override
	public Boolean canExecute(final String operator) {
		return null != operator && operator.trim().equalsIgnoreCase(Constants.ADD);
	}

}
