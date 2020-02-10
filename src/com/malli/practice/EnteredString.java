package com.malli.practice;

import java.util.Scanner;

public class EnteredString {
	public static void main(String[] args) {
		int len;
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		str=s.nextLine();
		len=str.length();
		System.out.println("ENTERED STRING LENGTH IS:" +len);
	}
}
