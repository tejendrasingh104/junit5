package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class ArrayTest {

	@RepeatedTest(3)
	void test(RepetitionInfo info) {

		Array ar = new Array();	
		int unsorted[] = {12,41,32,43,56,21,93,1,54,2};
		
		if(info.getCurrentRepetition() == 1)
			assertTimeout(Duration.ofMillis(10),()->ar.arraySorting(unsorted));
		if(info.getCurrentRepetition() == 2)
			assertTimeout(Duration.ofMillis(2),()->ar.arraySorting(unsorted));
		if(info.getCurrentRepetition() == 3)
			assertTimeout(Duration.ofMillis((long) 0.02),()->ar.arraySorting(unsorted));
		
		
//		int expected[] = {12,21,32,41,43,56};
//		int actual[] = ar.arraySorting(unsorted);
//		assertArrayEquals(expected, actual);
		
		
	}

}
