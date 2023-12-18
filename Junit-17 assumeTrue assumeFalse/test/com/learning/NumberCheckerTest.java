package com.learning;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberCheckerTest {

	NumberChecker nc = new NumberChecker();
	@Test
	@DisplayName("even odd testing")
	void testNumber() {
		boolean actual = nc.evenOddNumber(10);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	void testStringLengthtrue()
	{
		String str = "Tejendra";
		
		assumeTrue(str.length()>5);
		
	}
	@Test
	void testStringLengthfalse()
	{
		String str = "Tejendra";
		
		assumeFalse(str.length()<5);
		
	}
}
