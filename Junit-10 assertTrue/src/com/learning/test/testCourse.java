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
		assertTrue(pc.proceedWithCourse(new SqlCourse()));
		
	}

}
