package com.basic;

import sun.util.logging.PlatformLogger.Level;

public class TestEnum {
	public static void main(String[] args) {
		Level level = Level.ALL;
	System.out.println(level.getClass().getName());
	System.out.println(level.name());
	System.out.println(level.ordinal());
	Level levelOne[]= Level.values();
	for(int i=0; i < levelOne.length;i++)
	{
		System.out.println(levelOne);
		
	}
	
	
	
	}
	
	
	

}
