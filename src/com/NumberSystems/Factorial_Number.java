package com.NumberSystems;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of num");
int num=sc.nextInt();
sc.close();
for(int i=1;i<=num;i++)
{
	if(num%i==0)
	{
		System.out.println(i);
	}
}
	}

}
