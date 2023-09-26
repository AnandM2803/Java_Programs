package com.NumberSystems;

import java.util.Scanner;

public class Range_Strong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the range");
int range=sc.nextInt();
sc.close();
for(int i=1;i<=range;i++)
{
	int sum=0;
	int num=i;
	int temp=num;
	while(num!=0)
	{
		int d=num%10;
		sum=sum+fact(d);
		num=num/10;
	}
	if(sum==temp)
		System.out.println(temp);
}
	}
	static int fact(int d)
	{
		int fact=1;
		for(int i=1;i<=d;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
