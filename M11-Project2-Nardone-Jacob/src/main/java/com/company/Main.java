package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Main 
{
	public static void main(String[] args) {
		// Instantiate a random person
		Person person = new Person("Jacob", 100);

		// Instantiate the director and the production assistant
		Director director = new Director("Steve Carell", 54166.66);
		PA pa = new PA("Emily", 70, 80);

		// Put our actors into a container
		List<Actor> actors = new ArrayList<Actor>(Arrays.asList(
			new Actor("Zack Woods", 3333333.33, "Protagonist"),
			new Actor("Ryan Gosling", 2500000, "Best Friend"),
			new Actor("Zoe Kravits", 2500000, "Love Interest"),
			new Actor("Anne Hathaway", 2500000, "Sister"),
			new Actor("Constance Wu", 1666666.66, "Professor")
		));

		// Put our crew members into a container, along with the director and PA
		List<Crew> crew = new ArrayList<Crew>(Arrays.asList(
			new Crew("Michael", 20000, "Cinematography"),
			new Crew("Preston", 20000, "Cinematography"),
			new Crew("Jada", 18333.33, "Editing"),
			new Crew("Leon", 18333.33, "Visual Effects"),
			new Crew("Brian", 16666.66, "Script Writing"),
			new Crew("John", 16666.66, "Script Writing"),
			new Crew("Alina", 15000, "Sound"),
			new Crew("Jared", 13333.33, "Lighting"),
			new Crew("Samantha", 12500, "Hair & Makeup"),
			new Crew("Edgar", 10000, "Transportation"),
			new Crew("Cynthia", 6666.66, "Craft Services"),
			director,
			pa
		));

		// Instatiate our movie
		Movie movie = new Movie("Comedy", director, actors, crew, 80000000, 156000000);

		// Pay all actors and crew for 6 pay periods
		for (int i = 0; i < 6; ++i){
			movie.Payday();
		}

		// Calculate the movie's profit
		movie.calculateProfit(); 

		// Pay director their bonus royalties at 1%
		double royalty = director.payRoyalties(movie.getProfit(), 1);

		// Print some outputs
		System.out.printf("- The PA earned $%,.2f \n", pa.getEarned());
		System.out.printf("- The movie cost $%,.2f with a $%,.2f budget\n", movie.getMoneySpent(), movie.getBudget());
		System.out.printf("- The movie profited $%,.2f\n", movie.getProfit());
		System.out.printf("- The director made $%,.2f in royalties\n", royalty);
	}
}
