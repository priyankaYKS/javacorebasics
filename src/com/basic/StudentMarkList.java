package com.basic;

public class StudentMarkList {
	int registernumber;
	String Studentname;
	String totalsubject;
	private char[] setStudentname;
	public StudentMarkList() {
		
		
	}
	public StudentMarkList(int registernumber,String studentname,String totalsubject)
	{
		this.registernumber=registernumber;
		this.Studentname=studentname;
		this.totalsubject=totalsubject;
		}
	public static void main(String[] args)
	{
		StudentMarkList studentone=new StudentMarkList();
	
		studentone.setStudentname("priyanka");
		System.out.println(studentone.setStudentname);
		
	}
	
	
	

}
