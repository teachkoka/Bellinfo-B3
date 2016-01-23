package com.bellinfo.batch3.corejava.day10;

public class ThreadExamp1 {

	public static void main(String[] args) {
		new MyThread1("java");
		new MyThread1("Sql");
	}
}

class MyThread1 extends Thread{
	static int a=1;
	String name;
	
	MyThread1(String name){
		setName(name);
		start();
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			a++;
			System.out.println(getName()+" "+a);
			try {
				Thread.sleep(5000);
				//wait(5000);
			} catch (InterruptedException e) {
			}
		}
		
		
	}
	
	
}
