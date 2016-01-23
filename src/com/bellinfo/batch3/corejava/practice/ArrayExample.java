package com.bellinfo.batch3.corejava.practice;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] a){
		
		Scanner scan = new Scanner(System.in);
		int[] integerInititalization = new int[]{1,2,3};
		int[] intABC = new int[5];
		char[] carWithSize = new char[10];
		String[] stringArray = new String[10];
		float floatArray[] = new float[]{};
		float floatArray1[] = {1.1f,2.2f};
		Object obj = new Object();
		for(int x=0;x<=intABC.length-1;x++){
			
			intABC[x] = scan.nextInt();
		}
		
		for(int y=0; y<=intABC.length-1; y++){
			System.out.println(intABC[y]);
		}
		
		
		
	}
	
	

}
