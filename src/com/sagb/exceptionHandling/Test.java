package com.sagb.exceptionHandling;


class Check{
	static class InCheck {
		static void statCheckMeth() {
			System.out.println("statCheckMeth");
		}
		public void norCheckMeth() {
			System.out.println("norCheckMeth");
		}
	}
	ArithmeticException ae;
	public void meth1() {
		throw ae;
//		System.out.println("willReach?"); // No, unreachable code
	}
}

public class Test {
	class Dcheck{
		public static void bro() {
			System.out.println("bro");
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("Pause...");
			Thread.sleep(1000);
			System.out.println("Resume...");
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		try {
			System.out.println(1/0);
		}
		finally {
			System.out.println("clean up code");
		}
//		catch(Exception e) {
//			System.out.println("caught nicely");
//		}
//		catch(ArithmeticException ae) {
//			System.out.println("caught");
//		} //C.E -> Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
		
		Dcheck.bro();
		Check.InCheck.statCheckMeth();
//		Check.meth1(); //CE- Cannot make a static reference to the non-static method
		

	}


}
