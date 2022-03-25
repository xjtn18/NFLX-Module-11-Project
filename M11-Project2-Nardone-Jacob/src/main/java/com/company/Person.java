package com.company;


public class Person {

	// Attributes
	protected String _name;
	protected double _paid, _earned;


	// Methods

	public Person(String name, double paid) {
		_name = name;
		_paid = paid;
	}

	/** Pays this person their income per pay period, returns that income */
	public double pay(){
		_earned += _paid;
		return _paid;
	}


	// Getters and Setters

	public void setName(String name) { _name = name; }
	public void setPaid(double paid) { _paid = paid; }
	public void setEarned(double earned) { _earned = earned; }
	public String getName() { return _name; }
	public double getPaid() { return _paid; }
	public double getEarned() { return _earned; }

}
