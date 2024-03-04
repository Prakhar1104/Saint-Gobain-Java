package com.sagb.exceptionHandling;

public class Demo {

	public static void main(String[] args) {
		try {
			int a = 1+1;
			System.out.println("Try block");
			System.out.println(9/0);
		}
		catch(Exception e) {
			System.out.println(1/0);
		}
		finally {
			System.out.println(6/0);
		} // abnormal termination
//		Demo d = new Demo(); //or else make m1 static
//		System.out.println(d.m1());
	}
	public int m1() {
		try {
			return 777;
		}
		catch(Exception e) {
			return 888;
		}
		finally {
			return 555;
		}
	}

}
