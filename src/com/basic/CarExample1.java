package com.basic;

public class CarExample1 {
	static int speed;
	String model;
	String type;
	public  CarExample1() {
		System.out.println("empty cons");
	}
	public  CarExample1(int speed) {
		this();
		this.speed=speed;
		System.out.println("one args cons");
	}
	public CarExample1(String model,String type) {
		this(speed);
		this.model=model;
		this.type=type;
		System.out.println("two args cons");
	}
	public static void main(String[] args) {
		CarExample1 carExampleOne=new 	CarExample1(100);
		CarExample1 carExampleTwo=new 	CarExample1("Audi","pep");
		
	}
	

}
