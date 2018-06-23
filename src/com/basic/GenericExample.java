package com.basic;

import java.awt.List;

public class GenericExample {
	public static void main(String[] args) {
		// before jdk1.5
		List list=new ArrayList();
		list.add("String one");
		list.add("String two");
		list.add("String three");
		String val =(String)list.get(1);
		System.out.println(val);
		 
		
		//JDK1.5
		List<string> listOne=new ArrayList<>(); 
		
		
		
		List list=new ArrayList();
		listOne.add("String one");
		listOne.add("String two");
		listOne.add("String three");
		String valOne =listOne.get(1);
		System.out.println(valOne);
		
		
		
		
		
		
		
		
		
		
	}

}
