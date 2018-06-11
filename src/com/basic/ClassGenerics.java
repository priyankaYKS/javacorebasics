package com.basic;

public class ClassGenerics<T,S,R>{
	public  ClassGenerics() ;;;;;;;;;
		
	}
	public Object ClassGenerics(T t,S s) {
		return null;
	}
	public static void main(String[] args) {
		 ClassGenerics<Double, Double, Integer > cs =new  ClassGenerics<Double, Double, Integer >();
		 Integer i=cs.getCustomer(20.3,20.4);

	}

	

}
