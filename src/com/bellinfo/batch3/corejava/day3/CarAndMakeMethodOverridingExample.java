package com.bellinfo.batch3.corejava.day3;

public class CarAndMakeMethodOverridingExample {

	public static void main(String[] args) {
		
		Make make = new Make();
		make.engine();
		make.models();
		make.modeOfDriving();
		make.numberOfWheels();
		
		Car c = new Make();
		c.models();
		c.modeOfDriving();
		c.numberOfWheels();
		c.engine(); // not allowed
		
		//downgrading the feature of the CAR to Make in terms holding the reference
		Make m = new Car(); //not allowed
		}

}


class Car {	
	void numberOfWheels(){
		System.out.println("number of wheels 4");
	}
	void modeOfDriving(){
		System.out.println("on the road");
	}	
	
	void models(){
		System.out.println("All models");
	}
}

class Make extends Car {
	
	void models(){
		System.out.println("BMW X5");
	}
	
	void engine(){
		System.out.println("awesome engine");
	}
	
}

class plane {
	
	void engine(){
		System.out.println("Airplane engine");
	}
}