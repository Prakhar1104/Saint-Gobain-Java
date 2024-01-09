package com.saintgobain;


class MyException extends Exception{
	
	MyException(String s){
		super(s);
	}
	
}

public class MyClass {
	 public static void main(String args[])
	    {
	        try {
	            // Throw an object of user defined exception
	            throw new MyException("Prakhar Rai");
	        }
	        catch (MyException ex) {
	            System.out.println("Caught");
	            System.out.println(ex.getMessage());
	        }
	        
	         int[] myArray = new int[] {1,2,3};
	         
	         int[] sampleArray = {10,9,8};
		   	 for(int i: myArray) {
		   		 System.out.println(i);
		   	 }
	    }
	 
	 
	 

}
