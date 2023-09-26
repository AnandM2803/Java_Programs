package com.NumberSystems;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Eneter the value of num");
int num=sc.nextInt();
boolean flag=true;
sc.close();
for(int i=2;i<=num/2;i++)
{
	if(num%i==0)
	{
		flag=false;
		break;
	}
}
if(flag)
	System.out.println(num+"=is a prime number");
else 
	System.out.println(num+"=is not a prime number");
	}

}
