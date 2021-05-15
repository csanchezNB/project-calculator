package com.sanitas.calculator;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 
 * @author csanchez
 *
 */
@SpringBootTest
public class SpringFoxConfigTest {

	@Test
	public void whenDeploy_shouldLoadsSwaggerApi() {
		assertNotNull(SpringFoxConfig.api());
	}
}
