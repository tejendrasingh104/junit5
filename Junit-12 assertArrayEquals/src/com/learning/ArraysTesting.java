package com.learning;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTesting {

	@Test
	void testArrays() {
		
		int []expected = {2,4,6,8};
		int []actual = {8,2,6,4};
		
		Arrays.sort(actual); //{2,4,6,8}
		
		// assertEquals(expected, actual);  // here it will check the reference variable
		
		assertArrayEquals(expected,actual); // it will check content present inside the array.
	}
	@Test
	void testStringArrays()
	{
		String []expected = {"this", "is", "string testing"};
		String []actual = {"this", "is", "string testing"};
		
		assertArrayEquals(expected, actual);
		
	}

}
