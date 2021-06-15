package com.cjc;

public class Test {
public static void main(String[] args) {
	Student s1=new Student();
	s1.setRollno(80);
	s1.setName("xyz");
	
	Student s2=new Student();
	s2.setRollno(90);
	s2.setName("abc");
	System.out.println("Main---Start");
	System.out.println(s1.getRollno());
	System.out.println(s1.getName());
	System.out.println(s2.getRollno());
	System.out.println(s2.getName());
	System.out.println("Main---End");
}
}
