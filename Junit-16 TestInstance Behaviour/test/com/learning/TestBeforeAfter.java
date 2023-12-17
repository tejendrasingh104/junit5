package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestBeforeAfter 
{
	
	
	Shapes shape; 
	@BeforeAll
	 void beforeall()
	{
		System.out.println("before all");
	}
	TestBeforeAfter()
	{
		System.out.println("this is test class constructor");
	}
	@BeforeEach
	void init()
	{
		shape  = new Shapes();
		System.out.println("before test");
	}
	
	@Test
	void testcomputeSquareArea() 
	{
		
		assertEquals(25, shape.computeSquareArea(5));
		System.out.println("actual test");
	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	@EnabledOnJre(JRE.JAVA_21)
	void testcomputeCircleArea()
	{
		assertEquals(153.86, shape.computeCircleArea(7));
		System.out.println("actual test");
	}
	
	@Test
	@Disabled
	@DisplayName("rectangleArea")
	void testcomputeRectangleArea()
	{
		assertEquals(153.86, shape.computeRectangleArea(7));
		System.out.println("actual test");
	}
	
	@AfterEach
	void destroy()
	{
		System.out.println("close resources after test");
	}
	@AfterAll
	void afterall()
	{
		System.out.println("after all");
	}
	
}
