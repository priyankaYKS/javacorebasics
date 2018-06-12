package com.basic;

public class SingleArraySum {
	public static void main(String[] args) {
		int scores[] = { 1,2,3,4};
		int sum=0;
		for(int i=0; i<scores.length; i++)
		{
			sum=sum+scores[i];
		}
	System.out.println(sum);	
	}

}
