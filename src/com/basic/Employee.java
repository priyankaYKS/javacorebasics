package com.basic;

public class Employee {
	String firstName,lastName;
	double monthlysalary,yearlysalary,salary1;
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getMonthlysalary() {
		return monthlysalary;
	}


	public void setMonthlysalary(double monthlysalary) {
		if(monthlysalary>0)
		this.monthlysalary = monthlysalary;
	}
	
public double getYearlysalary() {
		return yearlysalary;
	}


	public void setYearlysalary(double yearlysalary) 
	{ 
		
		this.yearlysalary = yearlysalary;
	}


public static void main(String[] args)
	{
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setMonthlysalary(500);
		e2.setMonthlysalary(200);
		e1.setFirstName("rajesh");
		e1.setLastName("saravana priya");
		e2.setFirstName("dharani");
		e2.setLastName("priya");
		double salary=e1.getMonthlysalary();
		salary=12*salary;
		e1.setYearlysalary(salary);
		salary=e2.getMonthlysalary();
		salary=12*salary;
		e2.setYearlysalary(salary);
		salary=e1.getYearlysalary();
		salary=1.1*salary;
		e1.setSalary1(salary);
		salary=e2.getYearlysalary();
		salary=1.1*salary;
		e2.setSalary1(salary);
		System.out.println(e1.getYearlysalary());
		System.out.println(e2.getYearlysalary());
	    System.out.println(e1.getSalary1());
		System.out.println(e2.getSalary1());
	}

public double getSalary1() {
	return salary1;
}


public void setSalary1(double salary1) {
	this.salary1 = salary1;
}

}
