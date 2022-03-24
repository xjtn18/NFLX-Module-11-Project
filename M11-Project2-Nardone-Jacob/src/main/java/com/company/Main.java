package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Main 
{
	public static void main(String[] args) {
		// instantiate a random person
		Person person = new Person("Jacob", 100);

		// instantiate the director and the production assistant
		Director director = new Director("Steve Carell", 325000);
		PA pa = new PA("Emily", 65, 480);

		// Put our actors in a container
		List<Actor> actors = new ArrayList<Actor>(Arrays.asList(
			new Actor("Zack Woods", 1000000, "Lead Actor"),
			new Actor("Anne Hathaway", 500000, "Supporting Actress"),
			new Actor("Zoe Kravits", 500000, "Supporting Actress"),
			new Actor("Constance Wu", 500000, "Supporting Actress")
		));

		// Put our crew members into a container, along with the director and PA
		List<Crew> crew = new ArrayList<Crew>(Arrays.asList(
			new Crew("John", 180000, "Script Writing"),
			new Crew("Leon", 110000, "Visual Effects"),
			new Crew("Sammy", 75000, "Makeup"),
			new Crew("Jade", 50000, "Craft Services"),
			director,
			pa
		));

		// Instatiate our movie
		Movie movie = new Movie("Comedy", director, actors, crew, 5000000, 6000000);

		movie.Payday(); // pay everyone and calculate total profit

		// Print some outputs
		System.out.printf("- The PA earned $%,.2f \n", pa.getEarned());
		System.out.printf("- The movie cost $%,.2f with a $%,.2f budget\n", movie.getMoneySpent(), movie.getBudget());
		System.out.printf("- The movie profited $%,.2f\n", movie.getProfit());
		System.out.printf("- The director made $%,.2f in royalties\n", director.getEarned() - director.getPaid());
	}
}
