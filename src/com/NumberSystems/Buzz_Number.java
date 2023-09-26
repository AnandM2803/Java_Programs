package com.NumberSystems;

import java.util.Scanner;

public class Buzz_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of num");
int num=sc.nextInt();
if(num%7==0 || num%10==7)
{
	System.out.println("Is a Buzz Number");
}
else
{
	System.out.println("Is not a Buzz Number");
}
sc.close();
	}

}
