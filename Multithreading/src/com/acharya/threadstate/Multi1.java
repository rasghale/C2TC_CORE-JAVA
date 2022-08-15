package com.acharya.threadstate;
class Multi1 implements Runnable{

	
public void run() {
	System.out.println("thread is running");
}


public static void main(String args[]) {
	Multi1 a=new Multi1();
	Thread t=new Thread(a);
	t.start();
}
}
//thread is running