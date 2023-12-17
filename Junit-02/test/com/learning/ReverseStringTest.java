package com.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test(timeout=1)
	public void test() {
		ReverseString reverse = new ReverseString();
		assertEquals("hgnisardnejeT", reverse.reverseString("Tejendrasingh"));
	}

}
