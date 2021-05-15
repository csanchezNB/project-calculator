package com.sanitas.calculator;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 
 * @author csanchez
 *
 */
@SpringBootTest
public class ApplicationTest {

	@Test
	public void whenDeploy_shouldLoadsContext() {
		Application.main(new String[0]);
	}
}
