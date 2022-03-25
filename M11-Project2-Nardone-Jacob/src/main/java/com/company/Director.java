package com.company;


public class Director extends Crew {

	// Attrbiutes
	private double _royalty_percentage;
	

	// Methods

	public Director(String name, double paid, double royalty_percentage){
		super(name, paid, "Production");
		_royalty_percentage = royalty_percentage;
	}

	/** Pay royalties to the director as a percentage of a given profit value, returns that royalty amount */
	public double payRoyalties(double profit){
		double royalty = Math.max(0.0, (profit * (_royalty_percentage / 100))); // royalties can only be positive
		_earned += royalty;
		return royalty;
	}


	// Getters + Setters
	
	public void setRoyaltyPercentage(double royalty_percentage) { _royalty_percentage = royalty_percentage; }
	public double getRoyaltyPercentage() { return _royalty_percentage; }

}
