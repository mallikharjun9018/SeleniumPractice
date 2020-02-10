package com.malli.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {
public static void main(String[] args) {
	
	
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(9);
	al.add(4);
	al.add(12);
	al.add(10);
	System.out.println("ArrayList:"+al);
	
	LinkedList ll=new LinkedList();
	ll.add(10);
	ll.add(9);
	ll.add(4);
	ll.add(12);
	ll.add(10);
	ll.add(null);
	System.out.println("LinkedList:"+ll);
	
	HashSet h=new HashSet();
	h.add(10);
	h.add(9);
	h.add(4);
	h.add(12);
	h.add(10);
	System.out.println("HashSet:"+h);

	
	LinkedHashSet lh=new LinkedHashSet();
	lh.add(10);
	lh.add(9);
	lh.add(4);
	lh.add(12);
	lh.add(10);
	System.out.println("LinkedHashSet:"+lh);
	
	HashMap hm=new HashMap();
	hm.put(10, "MAnoj");
	hm.put(6, "Manoj");
	hm.put(11, "manoj");
	hm.put(1, "malli");
	hm.put(1, "malli");
	System.out.println("Haashmap:"+hm);
	hm.get(10);
	
	
	LinkedHashMap lhm=new LinkedHashMap();
	lhm.put(6, "value1");
	lhm.put(6, 10);
	lhm.put(10, "value1");
	lhm.put(1, null);
	System.out.println("LinkedHasshMap:"+lhm);
	String s=(String)lhm.get(1);
	System.out.println(s);
	
	
	
	
	
	
	
		
	
	
	}
}
