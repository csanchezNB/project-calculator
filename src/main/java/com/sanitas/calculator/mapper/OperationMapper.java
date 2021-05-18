package com.sanitas.calculator.mapper;

import org.springframework.stereotype.Component;

import com.sanitas.calculator.model.Addition;
import com.sanitas.calculator.model.Operation;
import com.sanitas.calculator.model.Subtraction;
import com.sanitas.calculator.utils.Constants;

/**
 * 
 * Handle conversion from operator to Operation
 *
 */
@Component
public class OperationMapper {

	/**
	 * Converts an operator into an Addition or Subtraction Object
	 * 
	 * @param operator String
	 * @return Operation - Addition or Subtraction
	 */
	public Operation convertToOperation(final String operator) {
		return operator.trim().equalsIgnoreCase(Constants.ADD) ? new Addition()
				: operator.trim().equalsIgnoreCase(Constants.SUB) ? new Subtraction() : null;
	}
}
