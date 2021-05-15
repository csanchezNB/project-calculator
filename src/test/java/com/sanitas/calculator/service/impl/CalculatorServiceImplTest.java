package com.sanitas.calculator.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sanitas.calculator.model.Addition;
import com.sanitas.calculator.model.Subtraction;

@SpringBootTest
public class CalculatorServiceImplTest {

	private static CalculatorServiceImpl calculatorService;

	@Before
	public void setup() {
		calculatorService = new CalculatorServiceImpl();
	}

	@Test
	public void whenExecuteWithAddition_shouldReturnTheAdditionOfTheNumbers() {
		assertEquals(calculatorService.execute(new BigDecimal(2.00), new BigDecimal(3.00), new Addition()),
				new BigDecimal(5.00));
	}

	@Test
	public void whenExecuteWithSubtraction_shouldReturnTheSubtractionOfTheNumbers() {
		assertEquals(calculatorService.execute(new BigDecimal(2.00), new BigDecimal(3.00), new Subtraction()),
				new BigDecimal(-1.00));
	}
}
