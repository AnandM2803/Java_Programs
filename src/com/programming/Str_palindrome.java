package com.programming;

import java.util.Scanner;

class Str_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s,s1,s2;
System.out.println("Enter the string =");
s=sc.next();
s1=s;
s2="";
sc.close();

for(int i=s1.length()-1;i>=0;i--)
{
	s2=s2+s1.charAt(i);
}
if(s2.equals(s))
{
	System.out.println("String is palindrome");
}
else
{
	System.out.println("String is not Palindrome");
}
	}

}
