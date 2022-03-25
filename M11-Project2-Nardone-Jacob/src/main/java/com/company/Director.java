package com.company;


public class Director extends Crew {

	// Methods

	public Director(String name, double paid){
		super(name, paid, "Production");
	}

	/** Pay royalties to the director as a percentage of a given profit value, returns that royalty amount */
	public double payRoyalties(double profit, double percentage){
		double royalty = Math.max(0.0, (profit * (percentage / 100))); // royalties can only be positive
		_earned += royalty;
		return royalty;
	}

}
