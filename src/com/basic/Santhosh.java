package com.basic;

public class Santhosh {
	int number;
	String name;
	public void priya() {
	System.out.println("Empty cons called");	
	}
	public void ais(String name) {
		this.name=name;
		System.out.println("one args cons");
		
}
	public void sara(int number,String name) {
		this.number=number;
		this.name=name;
		System.out.println("two args cons");
	}
public static void main(String[] args) {
	
	Santhosh s1=new Santhosh();
	Santhosh s2=new Santhosh("name");
	
	
	
	
}
