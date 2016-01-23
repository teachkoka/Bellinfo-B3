package com.bellinfo.batch3.corejava.day3;

public class SuperReferenceSubObject {
	
	public static void main(String[] args){
		Person1 s = new Student1();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.check);
		s.method();
		s.superOnlyMethod();
		
	}

}

class Person1 {
	int check =9;
	int id =1;
	String name="SuperSiva";
	void method(){
		System.out.println("Super method");
	}
	
	void superOnlyMethod(){
		System.out.println("SuperOnlyMethod");
	}
}

class Student1 extends Person1{
	int id =2;
	String name ="SubSiva";
	
	void method(){
		System.out.println("Sub method");
	}
	
	void subMethod(){
		System.out.println("Sub method");
	}
	
	
}