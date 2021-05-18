package com.sanitas.calculator.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.sanitas.calculator.exception.GeneralResponseException;
import com.sanitas.calculator.model.Operation;
import com.sanitas.calculator.service.CalculatorService;
import com.sanitas.calculator.utils.Constants;

/**
 * 
 * Implementation of Service layer
 *
 */
@Component
public class CalculatorServiceImpl implements CalculatorService {

	@Autowired
    private List<Operation> listOfOperations;

	 
	@Override
	public BigDecimal execute(final BigDecimal num1, final BigDecimal num2, final String operator) {
		for (Operation operation : listOfOperations) {
			if(operation.canExecute(operator)) {
				return operation.execute(num1, num2);
			}
		}

		throw new GeneralResponseException(HttpStatus.METHOD_NOT_ALLOWED, Constants.ERROR,
				Constants.DESCRIPTION_ERROR_OPERATOR);
	}

}
