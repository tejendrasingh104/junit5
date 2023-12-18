package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ShapesTest {

	Shapes shapes = new Shapes();
	
	@Nested
	
	class rectangleTests
	{
		@Test
		void testrectangleArea() {
			System.out.println();
			double actual = shapes.rectangleArea(2, 3);
			double expected = 6;
			assertEquals(expected, actual, "check your code");
		}
		
		@Test
		void testrectanglePerimeter()
		{
			double actual = shapes.rectanglePerimeter(2,3);
			double expected = 10;
			assertEquals(expected, actual, "check code");
		}
	}
	
	@Nested
	class circleTests
	{
		@Test
		void testcircleArea() {
			double actual = shapes.circleArea(2);
			double expected = 12.56;
			assertEquals(expected, actual, "check your code");
		}
		
		@Test
		void testcirclePerimeter()
		{
			double actual = shapes.circlePerimeter(2);
			double expected = 12.56;
			assertEquals(expected, actual, "check code");
		}
	}
	
	@Nested
	class squareTests
	{
		@Test
		void testsquareArea() {
			double actual = shapes.squareArea(5);
			double expected = 25;
			assertEquals(expected, actual, "check your code");
		}
		@Test
		void testsquarePerimeter()
		{
			double actual = shapes.squarePerimeter(5);
			double expected = 20;
			assertEquals(expected, actual, "check code");
		}
	}

}
