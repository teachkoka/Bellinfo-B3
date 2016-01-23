package com.bellinfo.batch3.corejava.day8;

public class EmployeeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("A");
		Employee e2 = (Employee)e1.clone();
		
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		
	}

}

class Employee implements Cloneable{
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
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
	
	
}
 