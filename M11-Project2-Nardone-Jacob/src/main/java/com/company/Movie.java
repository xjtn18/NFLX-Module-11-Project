package com.company;

import java.util.List;


public class Movie {

	public Movie(String genre, Director director, List<Actor> actors, List<Crew> crew, double budget){
		_genre = genre;
		_director = director;
		_actors = actors;
		_crew = crew;
		_budget = budget;
	}	

	public double calculateProfit(){
		_profit = 35.0; // test value
		return _profit;
	}

	public void Payday() {

		// _money_spent += 
	}

	// Getters + Setters

	public void setGenre(String genre)					{ _genre = genre; }
	public void setDirector(Director director)		{ _director = director; }
	public void setActors(List<Actor> actors)	{ _actors = actors; }
	public void setCrew(List<Crew> crew)			{ _crew = crew; }
	public void setBudget(double budget)				{ _budget = budget; }

	public String getGenre(String genre)								{ return _genre; }
	public Director getDirector(Director director)					{ return _director; }
	public List<Actor> getActors(List<Actor> actors)	{ return _actors; }
	public List<Crew> getCrew(List<Crew> crew)			{ return _crew; }
	public double getBudget(double budget)								{ return _budget; }


	// Private members

	private String _genre;
	private Director _director;
	private List<Actor> _actors;
	private List<Crew> _crew;
	private double _budget, _money_spent, _money_earned, _profit;

}