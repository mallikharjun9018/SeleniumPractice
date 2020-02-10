package com.malli.practice;

class ConstOne
{
	public ConstOne()
	{
		System.out.println("Parent");
	}
}
public class ConstTest extends ConstOne
{
     public ConstTest(String name)
{  
	this();
	//this(5);
	System.out.println("Chaild string");
}

public ConstTest(int num)
{  
	
	System.out.println("Chaild num");
}
public ConstTest()
{  
	this(5);
	System.out.println("default ");
}
public static void main(String[] args)
{
	ConstTest t=new ConstTest("Manoj");
}
}