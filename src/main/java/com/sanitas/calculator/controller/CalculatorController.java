package com.sanitas.calculator.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanitas.calculator.dto.ResultDto;
import com.sanitas.calculator.service.CalculatorService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(path = {"/api/v1/sanitas/calculator"}, produces = "application/json")
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;
	
	@Operation(summary = "Get result of addition of two numbers.")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Operation done", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = BigDecimal.class)) }),
			@ApiResponse(responseCode = "409", description = "Error retrieving user", content = @Content),
			@ApiResponse(responseCode = "400", description = "Incorrect request", content = @Content) })
	@GetMapping("/addition")
	public ResultDto executeAddition(BigDecimal num1, BigDecimal num2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Operation(summary = "Get result of subtraction of two numbers.")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Found the user", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = BigDecimal.class)) }),
			@ApiResponse(responseCode = "409", description = "Error retrieving user", content = @Content),
			@ApiResponse(responseCode = "400", description = "Incorrect request", content = @Content) })
	@GetMapping("/addition")
	public ResultDto executeSubtraction(BigDecimal num1, BigDecimal num2) {
		// TODO Auto-generated method stub
		return null;
	}

}
