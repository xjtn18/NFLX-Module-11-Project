package com.company;

import java.util.List;


public class Movie {

	// Attributes
	private String _genre;
	private Director _director;
	private List<Actor> _actors;
	private List<Crew> _crew;
	private double _budget, _money_spent, _money_earned, _profit;


	// Methods

	public Movie(String genre, Director director, List<Actor> actors, List<Crew> crew, double budget, double money_earned){
		_genre = genre;
		_director = director;
		_actors = actors;
		_crew = crew;
		_budget = budget;
		_money_earned = money_earned;
	}


	/** Updates the total movie profit */
	public void calculateProfit(){
		_profit = _budget - _money_spent + _money_earned; // box office + any unspent budget (or - any overspent budget)
	}


	/** Pays everyone involved, updates total money spent */
	public void Payday() {
		// pay the actors
		for (Actor a : _actors){
			_money_spent += a.pay();
		}

		// pay the crew (includes the director and the PA)
		for (Crew c : _crew){
			_money_spent += c.pay();
		}
	}


	// Getters + Setters

	public void setGenre(String genre) { _genre = genre; }
	public void setDirector(Director director) { _director = director; }
	public void setActors(List<Actor> actors) { _actors = actors; }
	public void setCrew(List<Crew> crew) { _crew = crew; }
	public void setBudget(double budget) { _budget = budget; }
	public void setMoneySpent(double money_spent) { _money_spent = money_spent; }
	public void setMoneyEarned(double money_earned) { _money_earned = money_earned; }
	public void setProfit(double profit) { _profit = profit; }

	public String getGenre() { return _genre; }
	public Director getDirector() { return _director; }
	public List<Actor> getActors() { return _actors; }
	public List<Crew> getCrew() { return _crew; }
	public double getBudget() { return _budget; }
	public double getMoneySpent() { return _money_spent; }
	public double getMoneyEarned() { return _money_earned; }
	public double getProfit() { return _profit; }

}