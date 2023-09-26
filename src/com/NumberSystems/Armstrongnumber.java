package com.NumberSystems;

import java.util.Scanner;

public class Armstrongnumber {
	static int power(int base,int exp)
	{
		int prod=1;
		while(exp!=0)
		{
			prod=prod*base;
			exp--;
		}
		return prod;
	}
	static int count(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of num");
int num=sc.nextInt();
int copy=num;
int sum=0;
sc.close();
while(num!=0)
{
	int d=num%10;
	sum=sum+power(d,count(copy));
	num=num/10;
}
if(sum==copy)
	System.out.println(copy+"=is a armstrong number");
else
	System.out.println(copy+"=is not a armstrong number");
	}

}
