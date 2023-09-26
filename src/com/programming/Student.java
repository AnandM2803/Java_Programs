package com.programming;

public class Student {
int sid;
String sname;
double sfees;
Student(int a,String b,double c)
{
	sid=a;
	sname=b;
	sfees=c;
}
public static void main(String[] args) {
	Student s=new Student(5911,"ravi",354.78);
	System.out.println(s.sid);
	System.out.println(s.sname);
	System.out.println(s.sfees);
}
}
