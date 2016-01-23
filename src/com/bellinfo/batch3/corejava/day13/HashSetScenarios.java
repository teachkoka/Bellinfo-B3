package com.bellinfo.batch3.corejava.day13;

import java.util.HashSet;

public class HashSetScenarios {

	public static void main(String[] args) {
		
		MobilePhone mp1 = new MobilePhone();
	       mp1.setName("Samsung");
	       mp1.setOs("Android");
	       mp1.setCost(500.00);
	       
	       MobilePhone mp2 = new MobilePhone();
	       mp2.setName("Apple");
	       mp2.setOs("iOS");
	       mp2.setCost(600.00);
	       

	       
	       MobilePhone mp3 = new MobilePhone();
	       mp3.setName("LG");
	       mp3.setOs("Android");
	       mp3.setCost(400.00);
	       
	       MobilePhone mp4 = new MobilePhone();
	       mp4.setName("Apple");
	       mp4.setOs("iOS");
	       mp4.setCost(600.00);
		
		
	       HashSet<MobilePhone> phoneSet1 = new HashSet<>();
	       phoneSet1.add(mp1);
	       phoneSet1.add(mp2);
	       phoneSet1.add(mp3);
	       phoneSet1.add(mp4);
	       
	       //Retrieving data from HashSet
	       System.out.println("***Using HashSet Eliminating duplicates***");
	       for(MobilePhone m:phoneSet1){
	    	   System.out.println(m);
	       }

	}

}
