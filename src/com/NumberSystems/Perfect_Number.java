package com.NumberSystems;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value num");
int num=sc.nextInt();
int sum=0;
sc.close();
for(int i=1;i<=num/2;i++)
{
	if(num%i==0)
	{
		sum=sum+i;
	}
}
if(num==sum)
	System.out.println("is perfect number");
else
	System.out.println("is not a perfect number");
	}

}
