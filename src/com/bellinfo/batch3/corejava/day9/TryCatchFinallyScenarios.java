package com.bellinfo.batch3.corejava.day9;

public class TryCatchFinallyScenarios {

	public static void main(String[] args) {
		
		method1();
	}

	static void method1(){
		int a =10;
		int b =0;
		method2(a, b);
	}
	static void method2(int a, int b){
		method3(a,b);
	}
	static void method3(int a, int b){
		int c=0;
		int array[] = new int[1];
		
		try{
			//System.exit(0);
			/*for(;;){
				
			}*/
			TryCatchFinallyScenarios tr=null;
			//tr.method1(1, 3);
			array[3]=121;	
		    c = a/b;
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
		System.out.println("result"+c);
	}
}
