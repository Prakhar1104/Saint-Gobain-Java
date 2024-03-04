package com.saintgob.java8features;

import java.util.ArrayList;

interface Rect{ 
	default void func1() {
		System.out.println("Rect Interface method 1");
	}
	static void func2() {
		System.out.println(" rect Interface method 2");
	}
	static void func3() {
		System.out.println(" rect Interface method 3");
	}
	void func4();
}

interface Circle{ //this is not functional interface as it does not have abstract method
	default void func1() {
		System.out.println("Interface method 1");
	}
	static void func2() {
		System.out.println("Interface method 2");
	}
	static void func3() {
		System.out.println("Interface method 3");
	}
}

@FunctionalInterface
interface Square{
	int calculate(int x);
}

public class FunctionalIntrfce {

	public static void main(String[] args) {
		Square sq = (int side) -> {
			return side*side;
		};// OR Square sq = side -> side*side
		
		new Thread( ()->{
			System.out.println("New Thread created");
		}).start();
		
		System.out.println("Area of Square is: " + sq.calculate(5));
		
		Circle.func2();
		Circle.func3();
		
//		Circle c = () -> {
//			c.func1();
//		}; // cant use lambda as circle is not functionaal interface
		
		Rect rect = null;
//		@SuppressWarnings("null")
		Rect r = ()->{
			rect.func1();
		};
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(12);
		al.add(3);
		al.add(42);
		al.add(56);
		
		al.forEach(ele -> System.out.println(ele));
		
		String s = 5>35 ? "Prakhar" : "Rai";
		System.out.println(s);
		
	}

}
