package com.acharya.threadstate;

public class Thread2 {
public static void main(String args[])
{
	Thread t=new Thread("New thread");
	t.start();
	String str=t.getName();
	System.out.println(str);
}
}
//New thread