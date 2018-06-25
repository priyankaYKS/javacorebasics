package com.basic;

public class PolyTest {
	
	public static void main(String[] args) {
		 PolyTest pt=new  PolyTest();
		 SportsCar sc=new SportsCar();
		 PoliceCar pc=new PoliceCar();
		 Taxi taxi=new Taxi();
		 pt.brake(sc);
		 pt.brake(taxi);
		 
		 
	}
public void brake(car car) {
	car.brake();
}
}
