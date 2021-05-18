package com.sanitas.calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.sanitas.calculator.exception.GeneralResponseException;
import com.sanitas.calculator.service.CalculatorService;
import com.sanitas.calculator.service.impl.CalculatorServiceImpl;
import com.sanitas.calculator.utils.Constants;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorControllerTest {

	@Autowired
	CalculatorController calculatorController;

	@Mock
	private final CalculatorService calculatorService = mock(CalculatorServiceImpl.class);


	@Test
	public void whenExecuteAddition_shouldReturnTheAdditionOfTwoNumbers() {
		when(calculatorService.execute(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(new BigDecimal(3.00));
		ResponseEntity<BigDecimal> result = calculatorController.execute(new BigDecimal(1.00), new BigDecimal(2.00),
				Constants.ADD);

		assertEquals(result.getBody(), new BigDecimal(3.00));
		assertEquals(result.getStatusCode(), HttpStatus.OK);
	}

	@Test
	public void whenExecuteSubtraction_shouldReturnTheSubtractionOfTwoNumbers() {
		when(calculatorService.execute(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(new BigDecimal(1.00));
		ResponseEntity<BigDecimal> result = calculatorController.execute(new BigDecimal(2.00), new BigDecimal(1.00),
				Constants.SUB);

		assertEquals(result.getBody(), new BigDecimal(1.00));
		assertEquals(result.getStatusCode(), HttpStatus.OK);
	}

	@Test
	public void whenExecuteOperationWithBadOperation_shouldReturn405Error() {
		when(calculatorService.execute(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(new BigDecimal(1.00));
		try {
			calculatorController.execute(new BigDecimal(2.00), new BigDecimal(1.00), "MUL");
		} catch (GeneralResponseException e) {
			assertEquals(e.getStatus(), HttpStatus.METHOD_NOT_ALLOWED);
		}
	}

	@Test
	public void whenExecuteOperationWithNoArgument_shouldReturn406Error() {
		when(calculatorService.execute(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(new BigDecimal(1.00));
		try {
			calculatorController.execute(null, null, Constants.SUB);
		} catch (GeneralResponseException e) {
			assertEquals(e.getStatus(), HttpStatus.NOT_ACCEPTABLE);
		}
	}


}
