package com.acharya.threadstate;
public class TestDaemonThread1 extends Thread{
	public void run() {
		if (Thread.currentThread().isDaemon());
		{
			System.out.println("Daemon thread works");
		}
		{
			System.out.println("User thread work");
		}
	}



	public static void main(String[] args) {
		
TestDaemonThread1 t1=new TestDaemonThread1();
TestDaemonThread1 t2=new TestDaemonThread1();  
TestDaemonThread1 t3=new TestDaemonThread1();  
t1.setDaemon(true);
t2.start();
t3.start();
	}

}
/*Daemon thread works
User thread work
Daemon thread works
User thread work*/
