package com.bellinfo.batch3.corejava.day7;

public class StringScenarios1 {

	public static void main(String[] args) { 
		
		String s1 = "orange";
		String s2 = "orange";
		String s3 = new String("orange");
		String s4 = new String("orange");
		
		if(s1.equals(s3)){
			System.out.println("string equals method return same");
		}else{
			System.out.println("not same ");
		}
		
		if(s1==s3){
			System.out.println("s1 and s3 are same");
		}else{
			System.out.println("==  return as not same");
		}
		
		
		
		
		if(s1==s2){
			System.out.println("s1 and s2 are same");
		}else {
			System.out.println("s1 and s2 are not same");
		}
	}

}
