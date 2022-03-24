package com.company;


public class Crew extends Person {

	// Attributes
	private String _department;



	// Methods

	public Crew(String name, double paid, String department){
		super(name, paid);
		_department = department;
	}



	// Getters + Setters

	public void setDepartment(String department) { _department = department; }
	
	public String getDepartment() { return _department; }

}