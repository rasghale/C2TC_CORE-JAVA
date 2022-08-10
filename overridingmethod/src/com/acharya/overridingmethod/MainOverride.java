package com.acharya.overridingmethod;
class Superclass{
	public void count(int n)
	{
		for (int i=1;i<n;i++)
		{
	System.out.println(i);
		}
	}
}
class Subclass extends Superclass
{
	public void count(int n)
	{
		for (int i=n;i>1;i++)
		{
			System.out.println(i);
			System.out.println();
		}
	}
}
public class MainOverride {
	public static void main(String[]args)
	{
		Superclass sup1=new Superclass();
		sup1.count(1 );
		Subclass sup2=new Subclass();
		sup2.count(2);
	}
}
//n number of op