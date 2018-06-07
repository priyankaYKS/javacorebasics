package com.basic;

public class Car1 {
 String model;
 int speed;
public boolean start() {
	 return false;
 }
public void accelerate() {
	
}
public void  priya(int i) {
	i=i+20;
	getClass().getName()
}
public static void main(String[] args) {
	Car1 carOne=new Car1();
	Car1 carTwo=new Car1();
	carOne.speed=10;
	carTwo.speed=110;
	
	System.out.println(carOne.speed);
	System.out.println(carTwo.speed);
	int count=100;
	carOne.priya(count);
System.out.println(	count);

}


}