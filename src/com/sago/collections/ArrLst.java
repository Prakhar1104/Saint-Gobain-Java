package com.sago.collections;

import java.lang.reflect.Field;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

//interface Collection{
//	public void m1();
//}
//interface List extends Collection{ // an interface extends other interfaces, not implements
//	public void m1();
//	public void m2();
//}
//class ArrayLst implements List{
//	public void m1() {
//		
//	}
//	public void m2() {
//		
//	}
//	public void m3() {
//		
//	}
//}
//abstract class List implements Collection{
//	public void m1() {} ;
//	abstract void m2();
//}
//class ArrayList extends List{
//	void m2() {};
//}
public class ArrLst {

	public static void main(String[] args) throws Exception{
		ArrayList li = new ArrayList();
		li.add("Three");
		li.add(3);
		li.add("One");
	
//		System.out.println(li.size()); //0 ; 10 is initial capacity and 0 is initial size 
		for(Object o : li) {
			System.out.println(o);
		} //or else sysout(li) // [Three, 3, One]
		li.set(1, "Two"); //replaces the object from that index with provided object value
		System.out.println(li);
		
		ArrayList al = new ArrayList(12);
		System.out.println(al.size()); //0 ; now 12 is initial capacity but size will still be 0 as empty
		System.out.println(al); // []
		

		Set hash_set = new HashSet();
		ArrayList arrlis = new ArrayList(hash_set); // array list of hash sets
		
		
		int[] arr = new int[10];
		arr[0] = 11;
		arr[1] = 12;
		arr[2] = 13;
		
		for(int i : arr) {
			System.out.println(i);
		}

	}
	

}
