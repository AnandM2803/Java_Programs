package com.programming;

import java.util.Scanner;

class Factotial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
int fact=1;
for(int i=num;i>=1;i--)
{
	fact=fact*i;
	
}
System.out.println(fact);
	
}
	}


