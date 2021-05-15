package com.sanitas.calculator.mapper;

import org.springframework.stereotype.Component;

import com.sanitas.calculator.model.Addition;
import com.sanitas.calculator.model.Operation;
import com.sanitas.calculator.model.Subtraction;
import com.sanitas.calculator.utils.Constants;

@Component
public class OperationMapper {

	public Operation convertToOperation(String operator) {
		return operator.equals(Constants.ADD) ? new Addition() : operator.equals(Constants.SUB) ? new Subtraction() : null;
	}
}
