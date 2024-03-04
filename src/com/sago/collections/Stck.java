package com.sago.collections;

import java.util.Stack;

public class Stck {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("Prakhar");
		s.push("Krishn");
		
		
		System.out.println(s.push("Radha"));
		
		System.out.println("------");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());

	}

}
