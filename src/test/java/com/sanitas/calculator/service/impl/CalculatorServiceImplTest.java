package com.sanitas.calculator.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sanitas.calculator.model.Addition;
import com.sanitas.calculator.model.Operation;
import com.sanitas.calculator.model.Subtraction;
import com.sanitas.calculator.service.CalculatorService;
import com.sanitas.calculator.utils.Constants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorServiceImplTest {

	@Mock
	private final CalculatorService calculatorService = mock(CalculatorServiceImpl.class);
	
	@Mock
	private Addition addition;
	
	@Mock
	private Subtraction subtraction;

	@Spy
	private List<Operation> listOfOperations = new ArrayList<Operation>();
	
	
	@Before
	public void setup() {
		listOfOperations.add(addition);
		listOfOperations.add(subtraction);
	}

	@Test
	public void whenExecuteWithAddition_shouldReturnTheAdditionOfTheNumbers() {
		when(calculatorService.execute(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(new BigDecimal(5.00));
		assertEquals(calculatorService.execute(new BigDecimal(2.00), new BigDecimal(3.00), Constants.ADD),
				new BigDecimal(5.00));
	}

	@Test
	public void whenExecuteWithSubtraction_shouldReturnTheSubtractionOfTheNumbers() {
		when(calculatorService.execute(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(new BigDecimal(-1.00));
		assertEquals(calculatorService.execute(new BigDecimal(2.00), new BigDecimal(3.00), Constants.SUB),
				new BigDecimal(-1.00));
	}
}
