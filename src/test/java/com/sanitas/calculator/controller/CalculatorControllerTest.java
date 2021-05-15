package com.sanitas.calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sanitas.calculator.dto.AdditionDto;
import com.sanitas.calculator.dto.SubtractionDto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorControllerTest {

	CalculatorController calculatorController = new CalculatorController();
	
	@Test
	void whenExecuteAddition_shouldReturnTheAdditionOfTwoNumbers() {
		AdditionDto additionDto = new AdditionDto();
		additionDto.setNum1(new BigDecimal(1.00));
		additionDto.setNum2(new BigDecimal(2.00));
		BigDecimal result = calculatorController.executeAddition(additionDto);
		
		assertEquals(result, new BigDecimal(3.00));
	}
	
	@Test
	void whenExecuteSubtraction_shouldReturnTheSubtractionOfTwoNumbers() {
		SubtractionDto subtractionDto = new SubtractionDto();
		subtractionDto.setNum1(new BigDecimal(2.00));
		subtractionDto.setNum2(new BigDecimal(1.00));
		BigDecimal result = calculatorController.executeSubtraction(subtractionDto);
		
		assertEquals(result, new BigDecimal(1.00));
	}
}
