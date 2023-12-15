package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest 
{

	Shapes shapes = new Shapes();
	
	@Test
	void areaSquareTest() 
	{
		assertEquals(25,shapes.areaSquare(5));
	}
	@Test
	void areaCircleTest() 
	{
		assertEquals(78.5,shapes.areaCircle(5),"area not calculated properly");
	}

}
