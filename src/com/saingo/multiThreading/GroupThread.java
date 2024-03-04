package com.saingo.multiThreading;


class NewThread extends Thread 
{ 
	NewThread(String threadname, ThreadGroup tgob) 
	{ 
		super(tgob, threadname); 
		start(); 
	} 
    public void run() 
	{ 

		for (int i = 0; i < 10; i++) 
		{ 
			try
			{ 
				Thread.sleep(10); 
			} 
			catch (InterruptedException ex) 
			{ 
				System.out.println("Exception encounterted"); 
			} 
		} 
	} 
} 
public class GroupThread 
{ 
	public static void main(String arg[]) 
	{ 
		// creating the thread group 
		ThreadGroup gfg = new ThreadGroup("parent thread group"); 
		ThreadGroup gfg_child = new ThreadGroup(gfg, "child thread group");
		ThreadGroup gfg_child_child = new ThreadGroup(gfg_child, "child child thread group");

		NewThread t1 = new NewThread("one", gfg); 
//		System.out.println("My name is- " + t1.getName());
		System.out.println("Starting one"); 
		NewThread t2 = new NewThread("two", gfg); 
		System.out.println("Starting two"); 
		NewThread t3 = new NewThread("three", gfg); 
		System.out.println("Starting three"); 

		// checking the number of active thread 
		System.out.println("number of active thread: "
						+ gfg.activeCount()); 
		System.out.println("number of active group thread: "
				+ gfg.activeGroupCount()); 
		gfg_child_child.destroy();
		System.out.println("number of active group thread after destroy: "
				+ gfg.activeGroupCount()); 
		
		Thread x = new Thread();
		Thread y = new Thread();
		Thread z = new Thread();
		x.start();
		
		System.out.println(x.getState());
		System.out.println(Thread.activeCount()); // 4 (x y z main)
		System.out.println(t3.getThreadGroup());
		System.out.println(x.getThreadGroup());
		
	} 
} 

