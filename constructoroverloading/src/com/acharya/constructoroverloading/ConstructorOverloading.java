package com.acharya.constructoroverloading;

public class ConstructorOverloading {
public ConstructorOverloading()
{
	System.out.println("This is zero argument constructor");
}
public ConstructorOverloading(int a)
{
	System.out.println("This is int a constructor ");
}
public ConstructorOverloading(double a)
{
	System.out.println("This is double a constructor");
}
public static void main (String[]args)
{
	ConstructorOverloading z1= new ConstructorOverloading();
	ConstructorOverloading z2= new ConstructorOverloading(5);
	ConstructorOverloading x=new ConstructorOverloading(12.4);
}
}
/*op*/
//This is zero argument constructor
//This is int a constructor 
//This is double a constructor
