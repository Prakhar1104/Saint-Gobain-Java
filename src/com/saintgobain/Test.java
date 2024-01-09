package com.saintgobain;


class Singleton {
 
    private static Singleton single_instance = null;

    public String s;
 
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
 

    public static synchronized Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
 
        return single_instance;
    }
}

//class Check implements Cloneable{
//	
//}

class MyThread extends Thread{
	int a = 10;
	@Override
	public void run() {
		System.out.println("I am thread");
	}
}

class MyRunnable implements Runnable{

	public void run(){
		System.out.println("I am Runnable thread");
	}
}

public class Test {

	public static void main(String[] args) {
//		System.out.println("Hello World");
//		
//		for(String i: args) {
//			System.out.println(i);
//			
//		}
		
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println(z.hashCode());
		
		if(x.equals(y) && y.equals(z)) {
			if(x.equals(z)) {
				System.out.println("All point to same loc");
			}
			else {
				System.out.println("x does not point to z");
			}
		}
		
		//thread class
		MyThread mt = new MyThread();
		mt.start();
		
		//runnable interface
		MyRunnable mr = new MyRunnable();
		
		Thread t = new Thread(mr);
		t.start();
		
		
		//anonymous
//		MyClass mc = new MyClass() {
//			public void test_method() {
//				System.out.println("Anonymous class");
//			}
//		};
		
		

	}

}
