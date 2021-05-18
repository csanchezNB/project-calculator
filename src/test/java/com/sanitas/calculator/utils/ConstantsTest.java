package com.sanitas.calculator.utils;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ConstantsTest {

	@Test
	public void whenCreateConstantsInstance_shouldCreateConstantsObject() {
        assertNotNull(new Constants());
	}
}
