package com.company;


public class PA extends Crew {

	// Attributes
	private double _hours_worked;


	// Methods

	public PA(String name, double paid, double hours_worked){
		super(name, paid, "Production");
		_hours_worked = hours_worked;
	}

	/** Pays this person their income per pay period, returns that income */
	@Override
	public double pay(){
		double paid_total = _paid * _hours_worked; // hourly pay multiplied by total hours
		_earned += paid_total;
		return paid_total;
	}


	// Getters + Setters

	public void setHoursWorked(double hours_worked) { _hours_worked = hours_worked; }
	public double getHoursWorked() { return _hours_worked; }

}
