package com.bellinfo.batch3.corejava.practice;

public class StduentPractice {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.setId(1);
		stu.setName("siva");
		
		Student stu1 = new Student();
		stu1.setId(1);
		stu1.setName("siva");
		System.out.println(new Student());
		System.out.println(stu1);
		if(stu.equals(stu1)){
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
	}

}

class Student {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
