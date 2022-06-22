package com.acharya.superkeyword;
class Animal{
	String color="Brown";
	void display() {
		System.out.println(color);
	}
}
class Dog extends Animal{
	String color="White";
	void printcolor() {
		System.out.println(color);
		
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d=new Dog();
System.out.println(d.color );

	}

}
