package com.acharya.threadstate;

public class Garbage {
public void finalize() {
	System.out.println("Object is garbage collected");
}
public static void main(String args[]) {
	Garbage g=new Garbage();
	Garbage g1=new Garbage();
	g=null;
	g1=null;
	System.gc();
}
}
/*Object is garbage collected
Object is garbage collected*/