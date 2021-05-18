package com.sanitas.calculator.dto;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ErrorDtoTest {

    @Test
    public void whenCreateDtoInstance_shouldCreateDtoObject() throws Exception {
    	ErrorDto errorDto = new ErrorDto();
        assertNotNull(errorDto);
        
        errorDto.setError("");
        errorDto.setErrorDescription("");
        errorDto.setStatus(0);
        errorDto.setTimestamp("");
        
        assertNotNull(errorDto.getError());
        assertNotNull(errorDto.getErrorDescription());
        assertNotNull(errorDto.getStatus());
        assertNotNull(errorDto.getTimestamp());

    }
}
