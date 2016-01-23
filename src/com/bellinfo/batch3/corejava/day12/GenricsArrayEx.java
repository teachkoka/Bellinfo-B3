package com.bellinfo.batch3.corejava.day12;

public class GenricsArrayEx {

	public static void main(String[] args) {
		Bucket<String> stringBucket = new Bucket<>(3);
		stringBucket.add("zero");
		stringBucket.add("one");
		stringBucket.add("two");
		
		
		System.out.println(stringBucket.get(0));
		System.out.println(stringBucket.get(1));
		System.out.println(stringBucket.get(2));
	}
}
class Bucket<T> {
	private T[] a;
	int index=0;
    
	Bucket(int size){
		a = (T[]) new Object[size];
	}
	public void add(T val){
		a[index] = val;
		index++;
	}
	public T get(int indVal) {
		return a[indVal];
	}
}