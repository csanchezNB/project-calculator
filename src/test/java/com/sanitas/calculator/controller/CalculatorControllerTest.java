package com.sanitas.calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sanitas.calculator.dto.ResultDto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorControllerTest {

	CalculatorController calculatorController = new CalculatorController();
	
	@Test
	void whenExecuteAddition_shouldReturnTheAdditionOfTwoNumbers() {
		ResultDto result = calculatorController.executeAddition(new BigDecimal(1.00), new BigDecimal(2.00));
		
		assertEquals(result, new BigDecimal(3.00));
	}
	
	@Test
	void whenExecuteSubtraction_shouldReturnTheSubtractionOfTwoNumbers() {
		ResultDto resultDto = calculatorController.executeSubtraction(new BigDecimal(2.00), new BigDecimal(1.00));
		
		assertEquals(resultDto.getResult(), new BigDecimal(1.00));
	}
}
