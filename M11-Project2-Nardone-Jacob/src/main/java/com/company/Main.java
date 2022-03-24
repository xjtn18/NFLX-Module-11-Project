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
		Director director = new Director("Steve Carell", 325000, 1);
		PA pa = new PA("Emily", 70, 480);

		// Put our actors into a container
		List<Actor> actors = new ArrayList<Actor>(Arrays.asList(
			new Actor("Zack Woods", 20000000, "Protagonist"),
			new Actor("Ryan Gosling", 15000000, "Best Friend"),
			new Actor("Zoe Kravits", 15000000, "Love Interest"),
			new Actor("Anne Hathaway", 15000000, "Sister"),
			new Actor("Constance Wu", 10000000, "Professor")
		));

		// Put our crew members into a container, along with the director and PA
		List<Crew> crew = new ArrayList<Crew>(Arrays.asList(
			new Crew("Michael", 120000, "Cinematography"),
			new Crew("Preston", 120000, "Cinematography"),
			new Crew("Jada", 110000, "Editing"),
			new Crew("Leon", 110000, "Visual Effects"),
			new Crew("Brian", 100000, "Script Writing"),
			new Crew("John", 100000, "Script Writing"),
			new Crew("Alina", 90000, "Sound"),
			new Crew("Jared", 80000, "Lighting"),
			new Crew("Samantha", 75000, "Hair & Makeup"),
			new Crew("Edgar", 60000, "Transportation"),
			new Crew("Cynthia", 40000, "Craft Services"),
			director,
			pa
		));

		// Instatiate our movie
		Movie movie = new Movie("Comedy", director, actors, crew, 80000000, 156000000);

		// Pay all actors and crew
		movie.Payday();
		// Calculate the movie's profit
		movie.calculateProfit(); 
		// Pay director their bonus royalties	
		director.payRoyalties(movie.getProfit());

		// Print some outputs
		System.out.printf("- The PA earned $%,.2f \n", pa.getEarned());
		System.out.printf("- The movie cost $%,.2f with a $%,.2f budget\n", movie.getMoneySpent(), movie.getBudget());
		System.out.printf("- The movie profited $%,.2f\n", movie.getProfit());
		System.out.printf("- The director made $%,.2f in royalties\n", director.getEarned() - director.getPaid());
	}
}
