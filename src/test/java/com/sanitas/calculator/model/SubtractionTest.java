package com.sanitas.calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SubtractionTest {


    @Test
    public void whenExecute_shouldReturnSubtractionOfNumbers() {
    	Subtraction subtraction = new Subtraction();
    	assertEquals(subtraction.execute(new BigDecimal(2.00), new BigDecimal(3.00)), new BigDecimal(-1.00));
    }

}
