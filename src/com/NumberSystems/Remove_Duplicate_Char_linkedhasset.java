package com.NumberSystems;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Remove_Duplicate_Char_linkedhasset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
LinkedHashSet<Character> set=new LinkedHashSet<>();
for(int i=0;i<str.length();i++)
{
	set.add(str.charAt(i));
}
for(Character ch:set)
{
	System.out.print(ch);
}
	}

}
