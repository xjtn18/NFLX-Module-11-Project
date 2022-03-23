package com.company;


public class Actor extends Person {

	public Actor(String name, double paid, double earned, String role){
		super(name, paid, earned);
		_role = role;
	}



	// Private members

	private String _role;

}