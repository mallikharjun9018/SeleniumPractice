package com.malli.practice;

import java.util.Scanner;

public class StringLength {
public static void main(String[] args) {
	int count=0;
	String sentense;
	System.out.println("Enter the sentense");	
	Scanner s=new Scanner(System.in);
	sentense=s.nextLine();
	char[] ch=sentense.toCharArray();
	for(int i=0; i<ch.length; i++)
		count++;
	System.out.println("Entered string length is:"+count);
	}
}
