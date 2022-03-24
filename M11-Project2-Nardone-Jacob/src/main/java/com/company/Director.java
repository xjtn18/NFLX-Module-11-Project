package com.company;


public class Director extends Crew {

	// Attrbiutes
	private double _royalty_percentage;
	

	// Methods

	public Director(String name, double paid, double royalty_percentage){
		super(name, paid, "Production");
		_royalty_percentage = royalty_percentage;
	}

	public void payRoyalties(double profit){
		_earned += Math.max(0.0, (profit * (_royalty_percentage / 100))); // royalties can only be positive
	}


	// Getters + Setters
	
	public void setRoyalties(double royalty_percentage) { _royalty_percentage = royalty_percentage; }
	public double getRoyaltyPercentage() { return _royalty_percentage; }

}