package com.bellinfo.batch3.corejava.day9;

public class MethodLevelExceptionsScenarios {
	public static void main(String[] args) {
		
		method1();
	}
	static void method1(){
		int a =10;
		int b =0;
		try{
		method2(a, b);
		}catch(ArithmeticException e){
			System.out.println("inside arthimetic exception");
			e.getStackTrace();
		}catch(IndexOutOfBoundsException iob){
			System.out.println("index out of bound execption");
		}catch(Exception e){
			System.out.println("exception class");
		}
		finally{
			System.out.println("finally always executes");
		}
	}
	static void method2(int a, int b) throws ArithmeticException,IndexOutOfBoundsException{
		method3(a,b);
	}
	static void method3(int a, int b) throws ArithmeticException{
		int c=0;
		int array[] = new int[1];
		array[3]=121;	
		c = a/b;
		System.out.println("result"+c);
	}
}
