package com.acharya.inheritance;

interface Dad{
	void snoring();
}
interface mom{
     void snoring();
}
public class Child implements Dad,mom{

public static void main(String[] args) {
		
            Child c=new Child();
            c.snoring();
	}

@Override
public void snoring() {
	System.out.println("Child snores");
	
}

}

