package com.company;


public class PA extends Crew {

	// Attributes
	private double _hours_worked;



	// Methods

	public PA(String name, double paid, double hours_worked){
		super(name, paid, "General"); // PA wouldn't have a specific department
		_hours_worked = hours_worked;
	}

	@Override
	public void pay(){
		_earned += _paid * _hours_worked; // hourly pay multiplied by total hours
	}



	// Getters + Setters

	public void setHoursWorked(double hours_worked) { _hours_worked = hours_worked; }

	public double getHoursWorked() { return _hours_worked; }

}