package com.sago.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

class ToCheck implements Comparator{
	@Override
	public int compare(Object s1, Object s2)  {
		return (Integer)s2 - (Integer)s1; //descending order
	}
	//default natural sorting order will be s1-s2 and will call compareTo() then sort in ascending order
	
}

public class Cursors {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		
		for(int i=1; i<=10; i++) {
			li.add(i);
		}
		
//		for (Iterator<Integer> iterator = li.iterator(); iterator.hasNext();) { //way 1
//			Integer integer = (Integer) iterator.next();
//			System.out.println("Seven X " + integer + " = " +  7*integer);
//		}
		
		for(Object o : li) { //way 2
			System.out.println("id- " + o);
		}
		
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
		
		Iterator<Integer> it = li.iterator();
		System.out.println("Before-"+li);
		while(it.hasNext()) { //way 3
			Integer i = (Integer) it.next();
			if(i % 2 == 0) {
				even.add(i);
			}
			else {
				odd.add(i);
			}
		}
		li.removeAll(even);
		System.out.println("Even removed- "+li);
		
		nums.add(even); nums.add(odd);
		
		for(Object o : nums) {
			System.out.println(o);
		}
		
		
		String s1 = "Radha"; // R-18
		String s2 = "Krishn"; //K-11
		System.out.println(s1.compareTo(s2)); //18-11 = 7
		System.out.println(s2.compareTo(s1)); //11-18 = -7
		
		 

	}
	
	

}
