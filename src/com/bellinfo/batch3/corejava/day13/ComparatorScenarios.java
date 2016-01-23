package com.bellinfo.batch3.corejava.day13;

import java.util.*;

public class ComparatorScenarios {

	public static void main(String[] args) {
		
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
		Movie m4 = new Movie();
		
		m1.setName("NPT");
		m1.setLanguage("Telugu");
		m1.setRating(4);
		
		m2.setName("BB");
		m2.setLanguage("Telugu");
		m2.setRating(3);
		
		m3.setName("SSR");
		m3.setLanguage("Telugu");
		m3.setRating(4);
		
		m4.setName("SSR");
		m4.setLanguage("English");
		m4.setRating(2);
		
		List<Movie> movieList = new ArrayList<>();
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		movieList.add(m4);
		
		System.out.println("*** Before sorting ***");
		for(Movie m:movieList){
			System.out.println(m);			
		}
		
		//Sorting
		Collections.sort(movieList, new NameBasedCriteria());
		Collections.sort(movieList, new RatingBasedCriteria());
		System.out.println("*** After Sorting based on Name");
		for(Movie m:movieList){
			System.out.println(m);
		}

	}

}


