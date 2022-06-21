package com.acharya.inheritance;

class Animal{
	void eat(){
		System.out.println("Animals eats.");
	}
}
class Cow extends Animal{
	void mow() {
		System.out.println("Cow mows.");
		
	}
}
class Calf extends Cow{
	void suckles() {
		System.out.println("calf suckles milk from mother cow.");
		
	}
}


public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calf c=new Calf();
		c.suckles();
		c.mow();
		c.eat();
	}

}
