package com.sago.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mpp {

	public static void main(String[] args) {
		Map<Integer, String> mpp = new HashMap<>();
		mpp.put(1, "Radha");
		mpp.put(2, "Krishn");
		mpp.put(3, "Kripalu");
		
		for(int i=1; i<=mpp.size(); i++) {
			System.out.println(mpp.get(i));
		}
		System.out.println(mpp);
		System.out.println(mpp.get(2));
		System.out.println(mpp.keySet());
		System.out.println(mpp.values());
		System.out.println(mpp.entrySet());
		
		Set set = mpp.entrySet();
		System.out.println("Set is- "+set);
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Entry o: mpp.entrySet()) { //Entry is an inner interface of Map(I)
			System.out.println(o.getKey() + "-->" + o.getValue()); // only applicable on Entry object
			o.setValue("RadhaKrishnKripalu");
			
		}
		System.out.println(mpp);
		
		for(String s: mpp.values()) {
			System.out.println("I love " + s);
		}

	}

}
