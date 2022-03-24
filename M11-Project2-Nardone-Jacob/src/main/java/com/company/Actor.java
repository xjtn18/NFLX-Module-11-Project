package com.company;


public class Actor extends Person {

	// Attributes
	private String _role;


	// Methods

	public Actor(String name, double paid, String role){
		super(name, paid);
		_role = role;
	}


	// Getters + Setters

	public void setRole(String role) { _role = role; }
	public String getRole() { return _role; }

}