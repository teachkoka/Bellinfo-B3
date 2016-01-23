package com.bellinfo.batch3.corejava.practice;

public class PRunnableThread {

	public static void main(String[] args) {
		 new RMyThread("java");
		 new RMyThread("sql");
	}
	
	
	

}
class RMyThread implements Runnable{
	
	Thread t= null;
	static int x =99;
    
	RMyThread(String name){
		t = new Thread(this, name);
		t.start();
	}
	
	@Override public void run() {
		for(int i=0;i<=10;i++){
			x++;
			System.out.println(x+"..."+t.getName());
		}
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}