package com.saintgob.java8features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streamjava8 {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>(); 
        fruits.add("Banana"); 
        fruits.add("Guava"); 
        fruits.add("Pineapple"); 
        fruits.add("Apple"); 
  
        System.out.println("Elements in ArrayList are : "
                           + fruits); 
  

        HashMap<String, Integer> res = fruits.stream().collect(Collectors.toMap( 
                Function.identity(), String::length, 
                (e1, e2) -> e1, HashMap::new)); 
  
        // printing the elements of the hashmap 
        System.out.println("Elements in HashMap are : "
                           + res); 

	}

}
