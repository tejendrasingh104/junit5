package com.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString reverse = new ReverseString();
		assertEquals("ardnejeT", reverse.reverseString("Tejendra"));
	}

}
