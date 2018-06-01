package com.basic;

public class Admin2 {
	public boolean iseven (int one)
	{
		return((one % 2)==0) ? true:false;
	}
	public static void main(String[] args) {
		Admin2 a1=new Admin2();
		
		System.out.println("The number is " +a1.iseven(4));
		
}
}
