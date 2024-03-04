package com.sago.collections;

import java.util.ArrayList;
import java.util.Vector;

public class Vec {

	public static void main(String[] args) {
		Vector vec = new Vector();
		System.out.println(vec.capacity());
		vec.add("Prakhar");
		vec.add(12);
		vec.add('A');
		vec.add(true);
		vec.add(12.69);
		vec.addElement(99);
		
		ArrayList li = new ArrayList();
		li.add("ArrayList");
		li.addAll(vec);
		System.out.println(li);

	}

}
