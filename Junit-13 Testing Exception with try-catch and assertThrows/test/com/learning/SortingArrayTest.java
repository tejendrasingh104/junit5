package com.learning;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingArrayTest {

	@Test
	void testsortArray() {
		SortingArray array = new SortingArray();
		
//		try {
//			
//		int[] unsorted = {10,6,1,9,4,3};
//		int[] sortedArray = array.sortingArray(unsorted);
//		
//		for(int ele : sortedArray)
//		{
//			System.out.print(ele + " ");
//		}
//		fail();
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println("exception generated");
//		}
		
		// by assertThrows 
		
		int[] unsorted = null; //{10,6,1,9,4,3};
		assertThrows(NullPointerException.class , () ->array.sortingArray(unsorted));
		
		
	}

}
