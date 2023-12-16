package com.learning.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.learning.dao.JavaCourse;
import com.learning.dao.JunitCourse;
import com.learning.dao.SqlCourse;
import com.learning.service.PurchaseCourse;

class testCourse {

	
	@Test
	void testproceedWithCourse() {
		
		PurchaseCourse pc = new PurchaseCourse();
		boolean status =  pc.proceedWithCourse(new JavaCourse());
		assertTrue(status);
		assertTrue(pc.proceedWithCourse(new JunitCourse()));
		assertFalse(pc.proceedWithCourse(new SqlCourse()));
		
		// in case of assertFalse testCases passes only when it gets false value.
		
		String str = "Tejendra";
		assertFalse(str.length()<5); //ans is false
		
	}

}
