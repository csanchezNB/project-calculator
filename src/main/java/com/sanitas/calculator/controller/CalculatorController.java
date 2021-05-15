package com.sanitas.calculator.controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanitas.calculator.dto.ResultDto;
import com.sanitas.calculator.exception.GeneralResponseException;
import com.sanitas.calculator.mapper.OperationMapper;
import com.sanitas.calculator.model.Operation;
import com.sanitas.calculator.service.CalculatorService;
import com.sanitas.calculator.utils.Constants;

import io.corp.calculator.TracerImpl;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(path = {"/api/v2/sanitas/calculator"}, produces = "application/json")
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;
	
    @Autowired
    private OperationMapper operationMapper;
    
    @Autowired
    private TracerImpl tracerAPI;

	@io.swagger.v3.oas.annotations.Operation(summary = "Get result of an operation of two numbers.")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Operation done", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ResultDto.class)) }),
			@ApiResponse(responseCode = "406", description = "Wrong parameters", content = @Content),
			@ApiResponse(responseCode = "500", description = "Error executing operation", content = @Content)})
	@GetMapping("/execute")
	public ResponseEntity<ResultDto> execute(BigDecimal num1, BigDecimal num2, String operator) {

		checkParams(num1, num2, operator);		
		
		ResultDto result = new ResultDto();
		try {
			Operation operation = operationMapper.convertToOperation(operator);
			result.setResult(calculatorService.execute(num1, num2, operation));
		} catch (Exception e) {
			if (e instanceof GeneralResponseException) {
				throw (GeneralResponseException) e;
			} else {
				tracerAPI.trace(LocalDateTime.now() + " -- CalculatorController - execute - EndWithStatus :: " + HttpStatus.INTERNAL_SERVER_ERROR);
				throw new GeneralResponseException(HttpStatus.INTERNAL_SERVER_ERROR, Constants.ERROR, Constants.DESCRIPTION_ERROR);
			}
		}
		
		tracerAPI.trace(LocalDateTime.now() + " -- CalculatorController - execute - EndWithStatus :: " + HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

	private void checkParams(BigDecimal num1, BigDecimal num2, String operator) {
		if(null == num1 || null == num2 || null == operator) {
			tracerAPI.trace(LocalDateTime.now() + " -- CalculatorController - checkParams - EndWithStatus :: " + HttpStatus.NOT_FOUND);
			throw new GeneralResponseException(HttpStatus.NOT_ACCEPTABLE, Constants.ERROR, Constants.DESCRIPTION_ERROR_PARAMS);			
		}
		
		if(!operator.trim().equalsIgnoreCase(Constants.ADD) && !operator.trim().equalsIgnoreCase(Constants.SUB)) {
			tracerAPI.trace(LocalDateTime.now() + " -- CalculatorController - checkParams - EndWithStatus :: " + HttpStatus.NOT_FOUND);
			throw new GeneralResponseException(HttpStatus.NOT_ACCEPTABLE, Constants.ERROR, Constants.DESCRIPTION_ERROR_PARAMS_OPERATOR);			
		}
		
	}

}
