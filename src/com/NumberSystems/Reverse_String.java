package com.NumberSystems;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
String str=sc.nextLine();
String rev="";
str.split(" ");
sc.close();
int count=0;
for(int i=str.length()-1;i>=0;i--)
{
	rev=rev+str.charAt(i);
	count++;
}
System.out.println("The Reversed String is---->"+rev);
System.out.println("The Number Of Characters is ------>"+count);
	}

}
