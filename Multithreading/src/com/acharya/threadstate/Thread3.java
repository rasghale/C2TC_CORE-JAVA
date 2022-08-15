package com.acharya.threadstate;
public class Thread3 implements Runnable{
	public void run() {
		System.out.println("Thread is running ");
	}


	public static void main(String args[]) {
		Runnable r=new Thread3();
		Thread t=new Thread(r,"Ras ");
		t.start();
		String str=t.getName();
		System.out.println(str);
	}

}
/*Ras 
Thread is running*/