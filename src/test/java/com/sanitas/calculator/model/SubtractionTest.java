package com.sanitas.calculator.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sanitas.calculator.utils.Constants;


@SpringBootTest
public class SubtractionTest {

	@Test
	public void whenExecute_shouldReturnSubtractionOfNumbers() {
		final Subtraction subtraction = new Subtraction();
		assertEquals(subtraction.execute(new BigDecimal(2.00), new BigDecimal(3.00)), new BigDecimal(-1.00));
	}

	@Test
	public void whenExecuteCanAddition_shouldReturnFalse() {
		final Subtraction subtraction = new Subtraction();
		assertFalse(subtraction.canExecute(Constants.ADD));
	}
	
	@Test
	public void whenExecuteCanSubtraction_shouldReturnTrue() {
		final Subtraction subtraction = new Subtraction();
		assertTrue(subtraction.canExecute(Constants.SUB));
	}
}
