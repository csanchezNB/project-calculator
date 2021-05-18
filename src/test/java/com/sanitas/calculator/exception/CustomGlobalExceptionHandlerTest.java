package com.sanitas.calculator.exception;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.sanitas.calculator.dto.ErrorDto;


@SpringBootTest
public class CustomGlobalExceptionHandlerTest {


    @Test
    public void whenCreateException_shouldReturnsNewException() {
    	final CustomGlobalExceptionHandler exHandler = new CustomGlobalExceptionHandler();
    	final String myErr = "MyError";
    	final String myDesc = "MyDescription";
    	GeneralResponseException gre = new GeneralResponseException(HttpStatus.BAD_GATEWAY, myErr, myDesc);
    	ResponseEntity<Object> response = exHandler.handleConflict(gre, null);

    	assertEquals(response.getStatusCode(), HttpStatus.BAD_GATEWAY);
    	assertTrue(response.getBody() instanceof ErrorDto);
    }
}
