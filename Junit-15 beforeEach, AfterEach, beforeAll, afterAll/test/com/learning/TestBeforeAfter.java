package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAfter 
{
	Shapes shape; 
	@BeforeAll
	static void beforeall()
	{
		System.out.println("before all");
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
	void testcomputeCircleArea()
	{
		assertEquals(153.86, shape.computeCircleArea(7));
		System.out.println("actual test");
	}
	
	@AfterEach
	void destroy()
	{
		System.out.println("close resources after test");
	}
	@AfterAll
	static void afterall()
	{
		System.out.println("after all");
	}

}
