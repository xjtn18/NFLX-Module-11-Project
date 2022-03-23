package com.company;


public class Crew extends Person {

	public Crew(String name, double paid, double earned, String department){
		super(name, paid, earned);
		_department = department;
	}


	// Private members

	private String _department;
}