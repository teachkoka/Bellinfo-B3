package com.bellinfo.batch3.corejava.day5;

public class ArrayScenario1 {

	public static void main(String[] args) {
		//declaration and initializing the Array
		int arrayOfInt[] = new int[]{1,2};
		//declaration of an array with size;
		int arrayOfInt1[] = new int[4];
		//another way declaration of an array with size;
		int[] arrayOfInt2 = new int[2];
		//another way declaration and initializing of the Array
		int[] arrayOfInt3 = new int[]{2,3,4};
		//another way declaration and initializing of the Array
		int[] arrayOfInt4 ={1,2,3};
		
		arrayOfInt1[0] =123;
		arrayOfInt1[1] =1232;
		arrayOfInt1[2] =13;
		arrayOfInt1[3] =1;


		for(int i=0; i<=arrayOfInt1.length;i++){
			int var = arrayOfInt1[i];
			System.out.println(var);
		}
		
		
		
		
	}

}
