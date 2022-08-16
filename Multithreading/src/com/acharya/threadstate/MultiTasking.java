package com.acharya.threadstate;



class MultiTasking extends Thread {
	public void run() {
		System.out.println("Task one");
	}
	public static void main(String args[]) {
		MultiTasking t1=new MultiTasking();
		MultiTasking t2=new MultiTasking();
		MultiTasking t3=new MultiTasking();
		t1.start();
		t2.start();
		t3.start();
				
	}
}
/*Task one
Task one
Task one*/
