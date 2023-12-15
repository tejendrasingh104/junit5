package com.learning;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		
		ReverseString reverse = new ReverseString();
		assertEquals("ardnejeT", reverse.reverseString("Tejendra"));
		assertEquals("avaJ", reverse.reverseString("Java"));
	}

}
