package com.bellinfo.batch3.corejava.day10;
public class RunnableExample {
	public static void main(String[] args) {
        new MyRunnable("java");
        new MyRunnable("sql"); 
	}
}
class MyRunnable implements Runnable{
	int a=0;
	Thread t;
	
	MyRunnable(String name){
		t = new Thread(this,name);
		t.start();		
	}
	public void run() {
	  for(int i=0;i<10;i++){
		  System.out.println(t.getName()+" "+i+" "+a);
		  try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  a++;
	  }
  }	
}