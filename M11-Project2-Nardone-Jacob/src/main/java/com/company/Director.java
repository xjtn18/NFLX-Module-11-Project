package com.company;


public class Director extends Crew {
	
	// Methods

	public Director(String name, double paid){
		super(name, paid, "Production");
	}

	public void payRoyalties(double profit, double percent){
		_earned += Math.max(0.0, (profit * (percent / 100))); // royalties can only be positive
	}

}