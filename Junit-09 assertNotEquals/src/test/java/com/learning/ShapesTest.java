package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest 
{

	Shapes shapes = new Shapes();
	
	@Test
	void SquareareaTest() 
	{
		assertNotEquals(125,shapes.areaSquare(5));
	}
	@Test
	void CircleareaTest() 
	{
		assertNotEquals(178.5,shapes.areaCircle(5),"area not calculated properly");
	}
	// supplier interface
	@Test
	void CircleareaTest_supplier() 
	{
		assertNotEquals(178.5,shapes.areaCircle(5),() -> "area not calculated properly");
	}
	
	//here its opposite to assertEquals() so test will pass only if expected and actual values are not same.

}
