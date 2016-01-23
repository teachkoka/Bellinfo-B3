package com.bellinfo.batch3.corejava.day5;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter id1");
		int id1 = scan.nextInt();
		System.out.println("Enter name1");
		String name1 = scan.next();
		
		System.out.println("Enter id2");
		int id2 = scan.nextInt();
		System.out.println("Enter nam2");
		String name2 = scan.next();
		
		System.out.println("Enter id3");
		int id3 = scan.nextInt();
		System.out.println("Enter nam3");
		String name3 = scan.next();
		
		System.out.println(id1+ " : " +name1);
		System.out.println(id2+ " : " +name2);
		System.out.println(id3+ " : " +name3);		
	}

}
