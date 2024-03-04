package com.saingo.multiThreading;

public class ThrdGrp {

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup p = new ThreadGroup("parent");
		ThreadGroup c = new ThreadGroup(p, "child");
		ThreadGroup n = new ThreadGroup(c, "grandchild");
		
		System.out.println(p.activeCount()); // 0, means no thread in this thread-group
		System.out.println(p.activeGroupCount());
		
		Thread t1 = new Thread(p, "t1");
		t1.start();
		Thread t2 = new Thread(p, "t2");
		t2.start();
		
		System.out.println(p.activeCount());
		

	}

}
