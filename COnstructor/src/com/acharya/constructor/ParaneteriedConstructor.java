package com.acharya.constructor;

public class ParaneteriedConstructor {
	int Id;
	String name;

	public ParaneteriedConstructor(int id,String name) {
		
		this.Id=id;
		this.name=name;
	}
	void info() {
		System.out.println("Id:"+Id+" " +"Name:"+name);
	}
	public static void main(String[] args) {
		ParaneteriedConstructor a=new ParaneteriedConstructor(123,"Ras");
		ParaneteriedConstructor b= new ParaneteriedConstructor(2324,"Rosan");
		a.info();
		b.info();
		

	}

}
