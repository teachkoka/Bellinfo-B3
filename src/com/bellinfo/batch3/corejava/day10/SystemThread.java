package com.bellinfo.batch3.corejava.day10;

public class SystemThread {

	public static void main(String[] args) {
		int x = 0;
		Thread t1 = new Thread();
		t1.setName("Java");

		Thread t2 = new Thread();
		t2.setName("Sql");

		for (int i = 0; i <= 10; i++) {

			System.out.println(t1.getName() + x);
			try {
				t1.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(t2.getName() + x);
			x++;
		}
	}
}
