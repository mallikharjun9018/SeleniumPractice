package com.malli.practice;

import java.util.Scanner;

public class PrimeTest {
public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("nter the number");
	n=s.nextInt();
	if(n/2==0)
	System.out.println("Entered numbr is prime");
	else	
			System.out.println("not a prime");
		
	}
}
