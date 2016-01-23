package com.bellinfo.batch3.corejava.practice;

public class PThread {

	public static void main(String[] args) {
		MyThread m1 = new MyThread("java");
		MyThread m2 = new MyThread("sql");
	}

}

class MyThread extends Thread{
	int x =99;
	
	MyThread(String name){
		setName(name);
		start();
	}
	
	public void run(){
		for(int i=0;i<=10;i++){
			x++;
			System.out.println("inside run"+i+ " "+getName());
			try{
				Thread.sleep(5000);
			}catch(Exception e){
				System.out.println();
			}
		}
		
	}
	
}
