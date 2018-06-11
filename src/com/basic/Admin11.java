package com.basic;

public class Admin11 {
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
	
	Admin11 s1=new Admin11();
Admin11 s2=new Admin11();
	s1.ais(priya);
	
	
}
}
