package com.bellinfo.batch3.corejava.practice;

import java.util.ArrayList;

public class BucketEx {

	public static void main(String[] args) {
		Bucket<Integer> b = new Bucket<Integer>(10);
		b.add(1);
		b.add(2);
		b.get(1);
		System.out.println(b.get(1));
		System.out.println(b.get(0));
		
		ArrayList<String> al = new ArrayList<>();
		al.add("test");
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("test1");
	}

}

class Bucket<T> {
	
	private T a[];
	static int index =0;
	
	Bucket(int size){
	  a = (T[]) new Object[size];	
	}
	
	public void add(T val){
		a[index] = val;
		index++;
	}
	public T get(int index){
		return a[index];
	}
}