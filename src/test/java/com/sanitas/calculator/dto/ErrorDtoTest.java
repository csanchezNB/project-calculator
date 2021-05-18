package com.sanitas.calculator.dto;

import static org.junit.Assert.assertEquals;
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
        assertEquals(0,errorDto.getStatus());
        assertNotNull(errorDto.getTimestamp());

    }
}
