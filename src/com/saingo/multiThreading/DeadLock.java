package com.saingo.multiThreading;

class A{
	public synchronized void dead() {
		B b = new B();
		System.out.println("Executing b.dead method...");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		b.dead();
	}
}
class B{
	public synchronized void dead() {
		A a = new A();
		System.out.println("Executing a.dead method...");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		a.dead();
	}
}

class MyThread1 extends Thread{
	public void run() {
		A a = new A();
		System.out.println("t1 executing a.dead");
		a.dead();
	}
}
class MyThread2 extends Thread{
	public void run() {
		B b = new B();
		System.out.println("t2 executing b.dead");
		b.dead();
	}
}

public class DeadLock {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		System.out.println("main thread...");
		t1.start();
		t2.start();
		
		

	}

}
