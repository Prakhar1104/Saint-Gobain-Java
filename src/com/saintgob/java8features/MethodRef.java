package com.saintgob.java8features;

import java.util.Arrays;
import java.util.List;

class CustomPrint{
	static void cusprint(String s) {
		System.out.print(s + "&&&");
	}
}

public class MethodRef {

	public static void main(String[] args) {
		List<String> li = Arrays.asList("Prakhar", "Rai", "Krishn");
		li.forEach(str->System.out.print(str + "&&& "));
		
		li.forEach(CustomPrint::cusprint);
		
	}

}
