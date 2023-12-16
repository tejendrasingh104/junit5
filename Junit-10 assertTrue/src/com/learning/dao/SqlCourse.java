package com.learning.dao;

public class SqlCourse implements Course {

	@Override
	public boolean coursePurchased() {
		System.out.println("Sql course purchased");
		return true;
	}

}
