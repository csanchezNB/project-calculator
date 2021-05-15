package com.sanitas.calculator.mapper;

import org.springframework.stereotype.Component;

import com.sanitas.calculator.model.Addition;
import com.sanitas.calculator.model.Operation;
import com.sanitas.calculator.model.Subtraction;

@Component
public class OperationMapper {

	public Operation convertToOperation(String operator) {
		return operator.equals("ADD") ? new Addition() : operator.equals("SUB") ? new Subtraction() : null;
	}
}
