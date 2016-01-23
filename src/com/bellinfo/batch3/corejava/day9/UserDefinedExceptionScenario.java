package com.bellinfo.batch3.corejava.day9;

import java.util.Scanner;

public class UserDefinedExceptionScenario {

	public static void main(String[] args) {
		try{
		System.out.println("Enter your card number");
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		method1(number);
		}catch(CardInvalidException cie){
			System.out.println(cie);
		}

	}
	
	static void method1(String number) throws CardInvalidException{
		if(number.length() == 16){
			System.out.println("You card has been accepted. "
					+ "And your product will be delivered soon");
		}else{
			throw new CardInvalidException(number);
		}
		
	}

}
