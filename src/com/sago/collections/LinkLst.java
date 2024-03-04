package com.sago.collections;

import java.util.LinkedList;

public class LinkLst {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(11);
		Object o = ll.getFirst();
		System.out.println(o);
		
		ll.add(12);
		ll.add(13);
		ll.addFirst(10);
		ll.addLast(14);
		
		ll.set(1, "Eleven");
	    System.out.println(ll.getLast());
	    System.out.println(ll);
	    


	}

}
