package com.bellinfo.batch3.corejava.day4;
public class OverridingScenario {
	public static void main(String[] args) {		
		Person person = new Student();
		System.out.println(person.id);
		System.out.println(person.name);
		person.overrideMtd();
	}
}
class Person {
	int id = 10;
	String name = "Person";
	void overrideMtd(){
		System.out.println("inside Person");
	}
}
class Student extends Person{
	int id = 20;
	String name="Student";
	
	void overrideMtd(){
		System.out.println("inside Student");
	}
}
