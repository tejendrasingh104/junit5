package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	
	ReverseString reverse = new ReverseString();
	@Test
	void oneWordTest() {
		
		assertEquals("avaJ",reverse.reverseString("Java"));
	}
	
	@Test
	void twoWordTest() {
		
		assertEquals("avaJ eroC",reverse.reverseString("Core Java"));
	}

}
