package com.sanitas.calculator.mapper;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sanitas.calculator.model.Addition;
import com.sanitas.calculator.model.Subtraction;
import com.sanitas.calculator.utils.Constants;

@SpringBootTest
public class OperationMapperTest {

	 private static OperationMapper operationMapper;

    @Before
    public void setup() {
    	operationMapper = new OperationMapper();
    }

    @Test
    public void whenConvertToAddition_shouldReturnAdditionObject() {
    	assertTrue(operationMapper.convertToOperation(Constants.ADD) instanceof Addition);
    }
    
    @Test
    public void whenConvertToSubtraction_shouldReturnAdditionObject() {
    	assertTrue(operationMapper.convertToOperation(Constants.SUB) instanceof Subtraction);
    }
}
