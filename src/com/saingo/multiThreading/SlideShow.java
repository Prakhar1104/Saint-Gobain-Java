package com.saingo.multiThreading;

import java.util.Iterator;
import java.util.Scanner;

class MySlide extends Thread{
	public void run() {
		try {
			slide();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void slide() throws InterruptedException{
		for(int i=1; i<=5; i++) {
			System.out.println("Slide-"+i);
			Thread.sleep(2000);
		}
	}
}

public class SlideShow  {

	public static void main(String[] args) throws InterruptedException{
		
		MySlide ms = new MySlide();
		ms.start();
		
		ms.join();
		System.out.println("You have viewed all images in your gallery.\nWant to start again?(Y/N)");
		
		Character c;
		Scanner sc = new Scanner(System.in);
		c = (Character) sc.next().charAt(0);
		
		Character option1 = 'Y';
		if(c.equals(option1)) {
//			MySlide new_ms = new MySlide();
//			new_ms.start();
			String[] arg = {"Random", "arguments"};
			main(arg);
		}
		else {
			System.out.println("Thank you for watching");
		}
	}

}
