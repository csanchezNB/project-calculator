package com.sanitas.calculator.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanitas.calculator.dto.ResultDto;
import com.sanitas.calculator.mapper.OperationMapper;
import com.sanitas.calculator.model.Operation;
import com.sanitas.calculator.service.CalculatorService;

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

	@io.swagger.v3.oas.annotations.Operation(summary = "Get result of an operation of two numbers.")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Operation done", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ResultDto.class)) }),
			@ApiResponse(responseCode = "500", description = "Error executing operation", content = @Content)})
	@GetMapping("/execute")
	public ResponseEntity<ResultDto> execute(BigDecimal num1, BigDecimal num2, String operator) {
		Operation operation = operationMapper.convertToOperation(operator);
		ResultDto result = new ResultDto();
		result.setResult(calculatorService.execute(num1, num2, operation));
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

}
