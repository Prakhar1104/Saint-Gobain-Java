package com.sago.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;


class ToCheck implements Comparator{
	@Override
	public int compare(Object s1, Object s2)  {
		//return (Integer)s2 - (Integer)s1; //descending order
		return ((Integer)s2).compareTo((Integer)s1);
	}
	//default natural sorting order will be s1-s2 and will call compareTo() then sort in ascending order
	
}

public class Cmprtrs {

	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		al.add(1);
//		al.add(3);
//		al.add(2);
//		System.out.println(al);
//		Collections.sort(al);
//		System.out.println(al);
		
		HashSet s = new HashSet(); // HashSet doesn't contain Comparator constructor
		s.add(1);
		s.add(3);
		s.add(2);
		s.add(0);
		s.add(4);
		System.out.println(s);
		
		
		TreeSet ts = new TreeSet(new ToCheck());
		ts.add(1);
		ts.add(3);
		ts.add(2);
		ts.add(0);
		ts.add(4);
		System.out.println(ts);
		
		StringBuffer sbf = new StringBuffer();
		System.out.println(sbf);

	}

}
