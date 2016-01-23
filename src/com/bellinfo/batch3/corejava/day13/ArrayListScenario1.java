package com.bellinfo.batch3.corejava.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListScenario1 {

	public static void main(String[] args) {
		
		ArrayListScenario1 al = new ArrayListScenario1();
		al.displayCountries();
		
		
	}
	
	public void displayCountries(){
		ArrayList<String> countries = new ArrayList<>();
		countries.add("india");
		countries.add("usa");
		countries.add("canada");
		countries.add("mexico");
		//displaying the values in list
		System.out.println("**before sorting");
		for(String country:countries){
			System.out.println(country);
		}
		
		//sorting an arraylist
		/*Collections.sort(countries);
		System.out.println("**after sorting");
		for(String country:countries){
			System.out.println(country);
		}*/
		
		//shuffling an arraylist
		Collections.shuffle(countries);;
		System.out.println("**after shuffling");
		for(String country:countries){
			System.out.println(country);
		}
		
		//sorting with TreeSet
		TreeSet<String> ts = new TreeSet<>();
		
		ts.addAll(countries);
		System.out.println("**Sorting with treeset");
		for(String country:ts){
			System.out.println(country);
		}
		//Displaying using vector
		System.out.println("**displaying using vector");
		Vector<String> v = new Vector<>();
		v.addAll(countries);
		for(String country:v){
			System.out.println(country);
		}
		
		//converting arrays to arraylist
		String[] str = {"red","white", "yellow","purple"};
		List<String> colorList = Arrays.asList(str);
		//displaying after converting an array to arrayList
		System.out.println("**converting arrays to List");
		for(String color:colorList){
			System.out.println(color);
		}
		
		//converting ArrayList to array
		System.out.println("**converting ArrayList to String array");
		String[] colorArray = (String[])colorList.toArray();
		for(String color:colorArray){
			System.out.println(color);
		}
	}
	
	
	
	

}
