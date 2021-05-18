package com.sanitas.calculator.exception;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.jparams.verifier.tostring.NameStyle;
import com.jparams.verifier.tostring.ToStringVerifier;

import nl.jqno.equalsverifier.EqualsVerifier;


@SpringBootTest
public class GeneralResponseExceptionTest {


	@Test
	public void equalsContract() {
		EqualsVerifier.simple().forClass(GeneralResponseException.class).withIgnoredFields("backtrace", "detailMessage", "cause", "stackTrace", "depth", "suppressedExceptions").verify();
	}
	
	@Test
	public void testToString()
	{
	    ToStringVerifier.forClass(GeneralResponseException.class).withIgnoredFields("backtrace", "detailMessage", "cause", "stackTrace", "depth", "suppressedExceptions")
	                    .withClassName(NameStyle.SIMPLE_NAME)
	                    .verify();
	}
}
