package com.bellinfo.batch3.corejava.day3;

public class ConstructorExample1 {
	public static void main(String[] args) {
		DEF def = new DEF(1);
		
	}
}
class ABC{
	ABC(){
		System.out.println("default user created consturtor in ABC");
	}
	ABC(int a){
		System.out.println(a+"argument constructor in ABC");
	}
}
class DEF extends ABC{
     DEF(){
    	 super();
    	 System.out.println("default construtor in DEF");
     }
     DEF(int a){
    	 System.out.println(a +"argument constructor in DEF");
     }
}