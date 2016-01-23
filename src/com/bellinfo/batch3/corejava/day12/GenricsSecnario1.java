package com.bellinfo.batch3.corejava.day12;

public class GenricsSecnario1 {

	public static void main(String[] args) {
		int n =10;
		String value= "only String";
		Basket<Integer> x = new Basket<>();
        x.setA(10);
        
        Basket<String> str = new Basket<>();
        str.setA("Genrics");        
   
        System.out.println(x.getA());
        System.out.println(str.getA());
	}
}
class Basket<T> {
	private T a;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
}

