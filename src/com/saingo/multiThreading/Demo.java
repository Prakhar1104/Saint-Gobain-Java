package com.saingo.multiThreading;

//interface Runnable{
//	abstract public void run();
//}
//class Thread implements Runnable{
//	public void run() {
//		//empty
//	}
//}

class MyThread extends Thread{
//	@Override  // 
//	public void run() {
//		System.out.println("I am run method");
//	}
//	public void start() { // this will get called and not thread class' start
//		super.start(); //now thread class' start will get called so run will invoke
//		System.out.println("I am start method");
//	}
}

public class Demo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
//		mt.start();
//		System.out.println("main thread");
	}
}
