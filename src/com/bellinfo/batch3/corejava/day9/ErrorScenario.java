package com.bellinfo.batch3.corejava.day9;

public class ErrorScenario {

	public static void main(String[] args) {
		method1();
	}
	static void method1(){
		method2();
	}
	static void method2(){
		method1();
	}
}
