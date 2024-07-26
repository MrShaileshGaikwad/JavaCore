package com.guvi;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
	//	ArrayList<String,Integer> al = new ArrayList<String,Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(23);
		l2.add(1);
		l.add(null);
		l.add("Shailesh");
		l.add("null");
		l.add("null");
		l.add(null);
		l.add("Shailesh");
		
		for (String ob : l) {
			System.err.println(ob);
		}
System.out.println(l2);
	}

}
