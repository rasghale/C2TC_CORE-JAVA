package com.acharya.interfaces;
import java.io.*;
interface Ras{
	final int id=10;
	void display();
	
}
public class Demo implements Ras {
	public void display() {
		System.out.println("Ras ");
	}
	public static void main(String[]args) {
Demo d=new Demo();
d.display();
System.out.println(id);
}
}
/*Ras 
10
*/