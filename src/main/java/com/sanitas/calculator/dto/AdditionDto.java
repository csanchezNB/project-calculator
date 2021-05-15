package com.sanitas.calculator.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class AdditionDto {

	private BigDecimal num1;
	
	private BigDecimal num2;
}
