package com.learning.dao;

public class JavaCourse implements Course {

	@Override
	public boolean coursePurchased() {
		System.out.println("java course purchased");
		return true;
	}

}
