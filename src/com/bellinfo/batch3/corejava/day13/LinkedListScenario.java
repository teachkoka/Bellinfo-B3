package com.bellinfo.batch3.corejava.day13;


import java.util.*;

public class LinkedListScenario {

	public static void main(String[] args) {
		
		LinkedList<Movie> linkedList = new LinkedList<>();
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
		
		linkedList.add(m1);
		linkedList.add(m2);
		linkedList.add(m3);
		linkedList.add(m4);
		
		Movie m = linkedList.getLast();
		System.out.println("***Last Element***");
		System.out.println(m);
		

	}

}
