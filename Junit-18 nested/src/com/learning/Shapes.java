package com.learning;

public class Shapes {
	
	public double rectangleArea(double length, double breadth)
	{
		return length*breadth;
	}
	public double circleArea(double radius)
	{
		return 3.14*radius*radius;
	}
	public double squareArea(double side)
	{
		return side*side;
	}
	public double rectanglePerimeter(double length, double breadth)
	{
		return 2*(length+breadth);
	}
	public double circlePerimeter(double radius)
	{
		return 2*3.14*radius;
	}
	public double squarePerimeter(double side)
	{
		return 4*side;
	}
}
