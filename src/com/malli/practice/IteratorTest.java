package com.malli.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("rameshsoft");
	al.add("manoj");
	al.add("rameshsoft");
	al.add("rameshsoft");
	al.add("manoj");
	al.add("manoj");
	al.add("manoj");
	al.add("rameshsoft");
	al.add("manoj");
	System.out.println(al);
	/*Iterator itr= al.iterator();
	while (itr.hasNext()) {
		String string = (String) itr.next();
		if (string.equalsIgnoreCase("manoj")) {
			System.out.println("Manoj Reddy");
		}
		else
		System.out.println("dokku");
		
}*/
for (Object object : al) {
	
}

}
}
