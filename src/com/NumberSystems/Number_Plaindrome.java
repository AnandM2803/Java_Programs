package com.NumberSystems;

import java.util.Scanner;

public class Number_Plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of num");
	int num=sc.nextInt();
	int copy=num;
	int rev=0;
	sc.close();
	while(num!=0)
	{
		int d=num%10;
		rev=rev*10+d;
		num=num/10;
	}
	if(copy==rev)
	System.out.println(rev+ " Is a plaindrome");
	else
		System.out.println(rev+" Is not a Plaindrome");
	}

}
