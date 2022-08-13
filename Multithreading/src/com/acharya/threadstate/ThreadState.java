package com.acharya.threadstate;
class ASS implements Runnable{
	public void run()
	{
try {
	Thread.sleep(29);
}
catch(InterruptedException ie)
{
	ie.printStackTrace();
}
System.out.println("The state of thread t1 while it invoked r"+ThreadState.t1.getState());
try
{
	Thread.sleep(233);
}
catch(InterruptedException ie){
ie.printStackTrace();
}
}
}

public class ThreadState implements Runnable{
 public static Thread t1;
 public static ThreadState obj;
 public static void main(String args[]) {
	 obj=new ThreadState();
	 t1=new Thread(obj);
	 System.out.println("The state of thread t1 after spawning it-"+t1.getState());
	 t1.start();
	 System.out.println("The state of thread t1 after invoking the method start()on it -"+t1.getState());
 }
 public void run() {
 ASS myObj=new ASS();
 Thread t2=new Thread(myObj);
 System.out.println("The state of thread t2 after spawning it-"+t2.getState());
 try{
	Thread.sleep(22);	 
	 }
 catch(InterruptedException ie)
 {
	 ie.printStackTrace();
 }
 System.out.println("The state of thread t2 after invoking method sleep() on it - \"+ t2.getState() );  ");
 try  
 {  
 // waiting for thread t2 to complete its execution  
 t2.join();  
 }  
 catch (InterruptedException ie)  
 {  
 ie.printStackTrace();  
 }  
 System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());  
 }  
}
/*
 * The state of thread t1 after spawning it-NEW The state of thread t1 after
 * invoking the method start()on it -RUNNABLE The state of thread t2 after
 * spawning it-NEW The state of thread t2 after invoking method sleep() on it -
 * "+ t2.getState() ); The state of thread t2 when it has completed it's
 * execution - NEW
 * 
 */