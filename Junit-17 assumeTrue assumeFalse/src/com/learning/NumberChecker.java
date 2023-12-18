package com.learning;

public class NumberChecker {
	
	public boolean evenOddNumber(int num)
	{
		if(num%2 == 0)
		{
			System.out.println(num + " is even no.");
			return true;
		}
		else
		{
			System.out.println(num + " is odd no.");
			return false;
		}
		
	}

}
