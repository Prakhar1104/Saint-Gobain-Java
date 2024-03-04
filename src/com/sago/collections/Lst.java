package com.sago.collections;

import java.util.ArrayList;
import java.util.List;

class Student{
	private int id;
	Student(int id){
		this.id = id;
	}
	public int getSId() {
		return id;
	}
}

class Teacher{
	private int id;
	Teacher(int id){
		this.id = id;
	}
	public int getTId() {
		return id;
	}
}

public class Lst {

	public static void main(String[] args) {
		List<Student> l = new ArrayList<>();
		
		Student s1 = new Student(11);
		Student s2 = new Student(12);
		Student s3 = new Student(13);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		
		for(int i=0; i<l.size(); i++) {
			System.out.println("Student- "+ l.get(i).getSId());
		}
		
		

	}

}
