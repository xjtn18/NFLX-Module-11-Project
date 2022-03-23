package com.company;


public class PA extends Crew {

	public PA(String name, double paid, double earned, double hours_worked){
		super(name, paid, earned, "General"); // PA wouldn't have a specific department
		_hours_worked = hours_worked;
	}



	// Private members

	private double _hours_worked;
}