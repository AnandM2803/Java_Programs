package com.NumberSystems;

import java.util.Scanner;

public class Decimal_To_StringConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
double x=sc.nextDouble();
String str=Double.toString(x);
String str1=x+"";
String str2=String.valueOf(x);
System.out.println(str);
System.out.println(str1);
System.out.println(str2);

	}

}
