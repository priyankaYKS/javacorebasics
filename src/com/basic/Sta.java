package com.basic;

public class Sta {
static int count=10;
int two=10;
static {
	count++;
	System.out.println("first static block"+count);
}
public Sta() {
	count++;
	System.out.println("cons"+count);
}
public void getItem() {
	count++;
	System.out.println("instance"+count);
}
public static void getcus() {
	// two++;
	count++;
System.out.println("static()"+count);
}
public static void main(String[] args) {
	
}
}
