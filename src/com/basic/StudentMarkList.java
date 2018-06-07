package com.basic;

public class StudentMarkList {
	int registernumber;
	String Studentname;
	 String totalsubject;
	
	public StudentMarkList() {
		
		
	}
	public StudentMarkList(int registernumber,String studentname,String totalsubject)
	{
		this.registernumber=registernumber;
		this.Studentname=studentname;
		this.totalsubject=totalsubject;
		}
	public void print() {
		System.out.println(this.registernumber);
		System.out.println(this.Studentname);
		System.out.println(this.totalsubject);
		
	}
	public static void main(String[] args)
	{
		StudentMarkList studentone=new StudentMarkList(36,"sara","five");
		
studentone.print();
		
	}


	
	

}
