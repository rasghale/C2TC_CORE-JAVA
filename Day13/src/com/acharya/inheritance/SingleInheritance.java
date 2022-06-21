package com.acharya.inheritance;
class breath{
	public void inout() {
		System.out.println("Animals breath in and out.");
	}
}
class Dog extends breath{
  public void bark() {
	System.out.println("Animals can bark");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
breath a=new breath();
a.inout();


	}

}
