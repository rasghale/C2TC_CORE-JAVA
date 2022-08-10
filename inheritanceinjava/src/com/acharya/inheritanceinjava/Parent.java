package com.acharya.inheritanceinjava;

 class Animal  {
	int x=4;
	public void display()
	{
		System.out.println("This is the parent class");
	}
}
class Dog extends Animal
{
	int  y =10;
	public void test()
	{
		System.out.println("This is test method of child class");
		
	}
}

class Parent
{
	public static void main(String[]args)
	{
	Dog c1=new Dog();
	c1.display();
	System.out.println("x="+c1.x);
	c1.test();
	System.out.println("y="+c1.y);
	// TODO Auto-generated method stub

	}
}

/*This is the parent class
x=4
This is test method of child class
y=10
*/