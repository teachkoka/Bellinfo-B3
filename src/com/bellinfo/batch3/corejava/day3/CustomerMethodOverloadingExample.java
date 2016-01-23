package com.bellinfo.batch3.corejava.day3;

public class CustomerMethodOverloadingExample {

	public static void main(String[] args) {
		CustomerMethodOverloadingExample cmoe = new CustomerMethodOverloadingExample();
		cmoe.customerDetails(1);
		cmoe.customerDetails("siva");
        cmoe.CustomerDetails(1, "siva");
        cmoe.customerDetails("siva", 1);
	}
	void customerDetails(String name){
	   System.out.println(name);
	}
	void customerDetails(int id){
	   System.out.println(id);	
	}
	public void customerDetails(String name, int id){
		System.out.println(name + id);
	}
	int CustomerDetails(int id, String name){
		System.out.println(name + id);
		return 1;
	}
	
}

