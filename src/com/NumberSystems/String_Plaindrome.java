package com.NumberSystems;

import java.util.Scanner;

public class String_Plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		String rev="";
		str.split(" ");
		sc.close();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println(rev+" Is a String Plaindrome");
		else
			System.out.println(rev+" Is not a String Plaindrome");
	}

}
