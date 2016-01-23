package com.bellinfo.batch3.corejava.day3;

public class MethodOverridingExample {
	
	public static void main(String[] args){
		A a = new A();
		a.method();
		a.notOverrideMethod();
		
		B b = new B();
		b.method();
		b.notOverrideMethod();
		b.methodInB();
		
	}

}


class A {
	void method(){
		System.out.println("inside method of class A");
	}
	void notOverrideMethod(){
		System.out.println("inside A");
	}
}
class B extends A {
   void method(){
		System.out.println("inside method of class B");
		//return 1;
	}	
   void methodInB(){
	    System.out.println("inside methodB of class B");
   }
}