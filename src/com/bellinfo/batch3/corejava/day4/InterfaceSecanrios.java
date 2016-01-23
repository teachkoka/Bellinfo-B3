package com.bellinfo.batch3.corejava.day4;

public class InterfaceSecanrios {

	public static void main(String[] args) {
		InterfaceSecanrios is = new InterfaceSecanrios();
		AudiQ5 audiQ5 = new AudiQ5();
		audiQ5.enigneType();
		audiQ5.symbol();
	}
	
	static {
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
}

interface Vehicle {
	int a = 10;
}

interface Car {
	int a = 20;
		void symbol();	
		
}
abstract class Audi implements Car, Vehicle{
	int a =30;
	void enigneType(){
		System.out.println(a);
		System.out.println("Audi Engine");
	} 
	static{
		System.out.println();
	}
	{
		
	}
}
class AudiQ5 extends Audi{
	public void symbol() {
		System.out.println(a);
		System.out.println("OOOOO");
	}
}
class AudiQ3 extends Audi{
	public void symbol() {
		System.out.println("OOO");
	}
}
