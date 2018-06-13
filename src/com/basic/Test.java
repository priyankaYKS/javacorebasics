package com.basic;

public class Test {
	public static void main(String[] args) {
		Test tc=new Test();
		Bike bye=new Bike();
		Vechical vec=new Vechical();
		bye.details();
		tc.details(bye);
		
		tc.details(vec);
		
	}
	public void details(Vechical vec)
	{
		vec.details();
	}
	
	
	
	
	
	
	

}
