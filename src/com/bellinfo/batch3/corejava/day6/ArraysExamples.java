package com.bellinfo.batch3.corejava.day6;

import java.util.Scanner;

public class ArraysExamples {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the count :");
		int size = scan.nextInt();
		Movies[] netflix = new Movies[size];
		Movies movies; 
		
		for(int i=0;i<=size-1;i++){
			movies = new Movies();
			System.out.println("Enter Name: "+ i);
		    movies.setName(scan.next());
		    System.out.println("Enter Categeory: "+i);
		    movies.setCategory(scan.next().charAt(0));
		    System.out.println("Enter amount: "+i);
		    movies.setAmount(scan.nextDouble());
		    netflix[i] =movies;
		}
		
		System.out.println("**** Result ******");
		System.out.println("Name\tCategory\tamount");
		Movies m = new Movies();
		for(int i=0;i<=size-1;i++){
			m = netflix[i];
			System.out.println(m.getName()+"\t"+m.getCategory()+"\t"+m.getName());
		}
		
	}

}

class Movies {
	
	private String name;
	
	private char category;
	
	private double amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getCategory() {
		return category;
	}

	public void setCategory(char category) {
		this.category = category;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	
}
