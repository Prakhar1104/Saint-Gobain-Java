package com.saintgobain;

class A{
	A(){
		System.out.println("constr of A");
	}
	public void meth1() {
		System.out.println("Meth1 of A");
	}
	public void duck() {
		System.out.println("quack quack");
	}
}
class B extends A{
	
	B(){
		System.out.println("constr of B");
		super.duck();
	}
	@Override
	public void meth1() {
		System.out.println("Meth1 of B");
		super.duck();
		duck();
	}
	
	
}

public class Inherita {

	public static void main(String[] args) {
		
	    A b = new B();
	    b.meth1();
	}

}
