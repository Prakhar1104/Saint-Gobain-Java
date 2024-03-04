package com.sagb.exceptionHandling;

import java.util.Scanner;

class MyException extends RuntimeException{
	MyException(String msg) {
		super(msg);
	}
}

public class CustomException {

	public static void main(String[] args) {
		
		int age;

		try (Scanner sc = new Scanner(System.in)) { //try-with-resources to manage resource leaks
			age = sc.nextInt();
		}
		if(age < 18 || age > 60) {
			throw new MyException("Not allowed");
		}
		else {
			System.out.println("Allowed");
			//we can throw the exception here as well
		}

	}

}
