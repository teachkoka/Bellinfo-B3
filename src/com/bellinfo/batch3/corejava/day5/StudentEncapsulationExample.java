package com.bellinfo.batch3.corejava.day5;

public class StudentEncapsulationExample {

	public static void main(String[] args) {
		StudentDetail sd = new StudentDetail();
		sd.setId(1);
		sd.setName("siva");
		int providedId = sd.getId();
		String providedName = sd.getName();
		System.out.println(providedId);
		System.out.println(providedName);
	}
}

class StudentDetail {
	private String name;
	private int id;
	public void setId(int idValue){
		id =idValue;
	}
	public int getId(){
		return id;
	}
	public void setName(String nameValue){
		name = nameValue;
	}
	public String getName(){
		return name;
	}
	
}
