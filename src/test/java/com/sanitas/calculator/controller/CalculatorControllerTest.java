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

import com.sanitas.calculator.dto.ResultDto;
import com.sanitas.calculator.exception.GeneralResponseException;
import com.sanitas.calculator.mapper.OperationMapper;
import com.sanitas.calculator.model.Addition;
import com.sanitas.calculator.model.Operation;
import com.sanitas.calculator.model.Subtraction;
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
	
    @Mock
    private final OperationMapper operationMapper = mock(OperationMapper.class);


	@Test
	public void whenExecuteAddition_shouldReturnTheAdditionOfTwoNumbers() {
		Operation operation = new Addition();
		when(operationMapper.convertToOperation(Mockito.anyString())).thenReturn(operation);
		when(calculatorService.execute(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(new BigDecimal(3.00));
		ResponseEntity<ResultDto> result = calculatorController.execute(new BigDecimal(1.00), new BigDecimal(2.00), Constants.ADD);
		
		assertEquals(result.getBody().getResult(), new BigDecimal(3.00));
		assertEquals(result.getStatusCode(), HttpStatus.OK);
	}

	@Test
	public void whenExecuteSubtraction_shouldReturnTheSubtractionOfTwoNumbers() {
		Operation operation = new Subtraction();
		when(operationMapper.convertToOperation(Mockito.anyString())).thenReturn(operation);
		when(calculatorService.execute(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(new BigDecimal(1.00));
		ResponseEntity<ResultDto> result = calculatorController.execute(new BigDecimal(2.00), new BigDecimal(1.00), Constants.SUB);

		assertEquals(result.getBody().getResult(), new BigDecimal(1.00));
		assertEquals(result.getStatusCode(), HttpStatus.OK);
	}
	
	@Test
	public void whenExecuteOperationWithBadArgument_shouldReturn406Error() {
		Operation operation = new Subtraction();
		when(operationMapper.convertToOperation(Mockito.anyString())).thenReturn(operation);
		when(calculatorService.execute(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(new BigDecimal(1.00));
		try {
			ResponseEntity<ResultDto> result = calculatorController.execute(new BigDecimal(2.00), new BigDecimal(1.00), "bad_argument");
		}catch (GeneralResponseException e) {
			assertEquals(e.getStatus(), HttpStatus.NOT_ACCEPTABLE);
		}

		
	}
}
