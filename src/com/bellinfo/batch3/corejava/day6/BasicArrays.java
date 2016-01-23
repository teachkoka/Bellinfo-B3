package com.bellinfo.batch3.corejava.day6;

public class BasicArrays {

	public static void main(String[] args) {
		
		int a =10;
		
		int array1[] = new int[3];
		
		int array2[] = new int[]{1,2,3,4};
		
		int array3[] = {3,9,1,2};
		
		array1[0] = 23;
		array1[1] =12;
		array1[2] = 22;
		
		
		int b = array1[0];
		int c =array1[1];
		int d = array1[2];
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		for(int i=0; i<=array1.length-1;i++){
			int g =array1[0];
			System.out.println(g);
		}
 		
		

	}

}
