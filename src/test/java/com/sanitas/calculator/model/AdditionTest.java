package com.sanitas.calculator.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sanitas.calculator.utils.Constants;


@SpringBootTest
public class AdditionTest {

	@Test
	public void whenExecute_shouldReturnAdditionOfNumbers() {
		final Addition addition = new Addition();
		assertEquals(addition.execute(new BigDecimal(2.00), new BigDecimal(3.00)), new BigDecimal(5.00));
	}
	
	@Test
	public void whenExecuteCanAddition_shouldReturnTrue() {
		final Addition addition = new Addition();
		assertTrue(addition.canExecute(Constants.ADD));
	}
	
	@Test
	public void whenExecuteCanSubtraction_shouldReturnFalse() {
		final Addition addition = new Addition();
		assertFalse(addition.canExecute(Constants.SUB));
	}

}
