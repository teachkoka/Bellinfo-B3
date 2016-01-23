package com.bellinfo.batch3.corejava.day7;

public class ObjectExample {
	int a=10;
	String name ="Siva";
	double fee = 12.43;
	public static void main(String args[]){
		
		ObjectExample oe = new ObjectExample();
		
		System.out.println(oe.toString());
		
		
	}
	
	public String toString(){
		 return "ObjectExample. Values inside "+a+" name "+name+" fee "+fee;
	 }
	

}
