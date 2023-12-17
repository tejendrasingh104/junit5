package com.learning;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class SortingArrayTest {

	@Test
	void testsortArray() {
		SortingArray array = new SortingArray();
		
		int[] unsorted = {2,4,9};
		
		assertTimeout(Duration.ofSeconds(1), ()->array.sortingArray(unsorted ));
		
	}

}

// in junit4 we have to write in @Test(timeout=1) 