package com.basic;

public class CloneExample implements clonable {
	public  CloneExample() {
		
	}
	public static void main(String[] args) {
		try
		{
		 CloneExample ceOne=new  CloneExample();
		 CloneExample ceTwo= (CloneExample)ceOne.clone();
		 System.out.println(ceOne.hashCode() +" === "+ceTwo.hashCode());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
