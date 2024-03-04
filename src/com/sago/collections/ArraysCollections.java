package com.sago.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator{
    public int compare(Object obj1, Object obj2) {
		return (Integer)obj2 - (Integer)obj1;
	}
}

public class ArraysCollections {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(1);
		al.add(5);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al, new MyComparator());
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
		
		Comparator c = Collections.reverseOrder(new MyComparator());
		Collections.sort(al, c);
		System.out.println(al);
		
		
		
		
		//Arrays
		int[] arr = {3,4,2,5,1};
		Arrays.sort(arr);
		for(int ele:arr) {
			System.out.print(ele + " ");
		}

	}

}
