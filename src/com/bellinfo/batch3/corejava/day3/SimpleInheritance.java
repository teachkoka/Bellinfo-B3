package com.bellinfo.batch3.corejava.day3;

public class SimpleInheritance {

	public static void main(String[] args) {
		//Simple way to access Base class
		Base base1 = new Base();
		base1.baseMethod();
	    int x= base1.a;
		
	    //Child Object and validating inheritance behaviour
	    BaseChild baseChild = new BaseChild();
	    baseChild.baseMethod();
	    System.out.println(baseChild.a);
	    
	    //Multilevel inheritance
	    Child child = new Child();
	    child.baseMethod();
	    System.out.println(child.a);
	    
	    //Hierarchical Inheritance
	    Child1 child1 = new Child1();
	    child1.baseMethod();
	    System.out.println(child1.a);
	    
	    
	    
	}
}
class Base {
	int a = 10;
	void baseMethod() {
		System.out.println("inside Base Method");
	}
}
class BaseChild extends Base {
	
	void baseChildMethod(){
		System.out.println("inside BaseChild method");
	}

}
class Child extends BaseChild {
	
}

class Child1 extends BaseChild {
	
}