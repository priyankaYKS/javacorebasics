package com.basic;

public class Date {
int day;
int month;
int year;
public Date(int day,int month,int year) {
	this.day=day;
	this.month=month;
	this.year=year;
	
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
	public void displayDate()
	{
		System.out.println(day+"/"+month+"/"+year);
	}

public static void main(String args[])
{
	Date d1=new Date(1,12,2015);
	d1.displayDate();
	
}	
	
}

