package com.acharya.inter;
interface Vehicle{
	void Engine();
}
interface Automobile extends Vehicle{
	void getMileage();
}
class R15 implements Automobile{
	public void Engine() {
		System.out.println("Liquid cooled SOHC 4- valve fuel-injected engine.");
	}
	public void getMileage() {
		System.out.println("Mileage is 40 km/L.It saves a lot of fuel.It is fuel efficient.");
	}
}
public class Bike {

	public static void main(String[] args) {
	R15 a=new R15();
	a.getMileage();
	a.Engine();

	}

}
