package com.bellinfo.batch3.corejava.day5;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] a = new int[4];
		
		for(int i=0; i<=3;i++){
			a[i] = scan.nextInt();
		}
		
		for(int i=0;i<=a.length;i++){
			System.out.println(a[i]);
		}
		
	}

}
