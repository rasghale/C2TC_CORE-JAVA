package com.acharya.accessmodifier;
public class accessModifier {
	private int id;
	private String name;
	
	public  String getName(){
	return name;
}
	public void setNamw(String n) {
		
	}

	public static void main(String[] args) {
		accessModifier obj= new accessModifier();
		obj.id=20;
		obj.name="Ras";
		
	}

}
