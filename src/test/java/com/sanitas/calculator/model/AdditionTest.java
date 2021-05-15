package com.sanitas.calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdditionTest {


    @Test
    public void whenExecute_shouldReturnAdditionOfNumbers() {
    	Addition addition = new Addition();
    	assertEquals(addition.execute(new BigDecimal(2.00), new BigDecimal(3.00)), new BigDecimal(5.00));
    }

}
