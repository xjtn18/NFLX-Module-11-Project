package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Main 
{
	public static void main( String[] args ) {
		Person person = new Person("Chris", 50.0, 100.0);

		// Put our actors in a container
		List<Actor> actors = new ArrayList<Actor>(Arrays.asList(
			new Actor("Zack Woods", 50.0, 100.0, "Lead Actor"),
			new Actor("Anne Hathaway", 50.0, 100.0, "Supporting Actress"),
			new Actor("Zoe Kravits", 50.0, 100.0, "Supporting Actress"),
			new Actor("Constance Wu", 50.0, 100.0, "Supporting Actress")
		));

		// Put our crew members into a container
		List<Crew> crew = new ArrayList<Crew>(Arrays.asList(
			new Crew("John", 50.0, 50.0, "Script Writing"),
			new Crew("Leon", 50.0, 50.0, "Visual Effects"),
			new Crew("Sammy", 50.0, 50.0, "Makeup"),
			new Crew("Jade", 50.0, 50.0, "Craft Services")
		));

		PA pa = new PA("Emily", 100.0, 0.0, 20.0);

		Director director = new Director("Steve Carell", 300.0, 0.0);

		Movie movie = new Movie("Comedy", director, actors, crew, 155000);


		System.out.println();




		System.out.println("\nRan successfully.\n");
	}
}
