package com.basic;

public class Car {
	String name;
	String type;

	public Car() {
		
	}
	public Car ( String name,String type) {
		this.name=name;
		this.type=type;
		}
	public static void accelerate()
	{
		System.out.println();
	}
	public void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car("hyundai","vechicle");
		c1.name="aadi";
		c1.type="hfkjds";
		c1.accelerate();
		
		
		
		
	}
	

}
