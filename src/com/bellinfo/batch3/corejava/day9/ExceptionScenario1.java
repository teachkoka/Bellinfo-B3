package com.bellinfo.batch3.corejava.day9;

import java.util.Scanner;

public class ExceptionScenario1 {
	public static void main(String[] args) {
		boolean isZero=true;
		try{	
				Scanner scan = new Scanner(System.in);
				System.out.println("enter a value:");
				int a = scan.nextInt();
				System.out.println("enter b value:");
				int b = scan.nextInt();
				int c =a/b;
				System.out.println("Result"+c);
				isZero=false;
			}catch(Exception e){
				System.out.println("Enter non zero values");
			}
	 System.out.println("Program ended normally");
	}
}
