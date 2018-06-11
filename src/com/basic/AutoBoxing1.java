package com.basic;

public class AutoBoxing1 {
	public static void main(String[] args) {
		
		Integer val=new Integer(20);
		val++;
		int k=val + 30;
		System.out.println(val);
		getItem(20,new policeCar(),new sportsCar(),new taxi());
		
		
	}
	public static  void getItem(int count,car... car) {
		for(i=0; i < car.length; i++)
		{
			System.out.println(car[i]);
		}
	}

}
