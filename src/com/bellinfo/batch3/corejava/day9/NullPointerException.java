package com.bellinfo.batch3.corejava.day9;

public class NullPointerException {
	
	static NullPointerException npe;
	public static void main(String[] args) {
		try{
		npe.method();
		}
		catch(Exception e){
			System.out.println("General Exception");
		}
		System.out.println("program continued even after exception");
	}
	
	void method(){
		System.out.println("in method 1");
	}

}
