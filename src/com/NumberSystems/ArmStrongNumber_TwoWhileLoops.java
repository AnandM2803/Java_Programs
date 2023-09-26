package com.NumberSystems;

import java.util.Scanner;

public class ArmStrongNumber_TwoWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{	
		int num1=i;
		int num2=i;
		int num3=i;
		int count=0;
		int sum=0;
		while(num1!=0)
		{
			num1=num1/10;
			count++;
		}
		while(num2!=0)
		{
			int rem=num2%10;
			sum+=Math.pow(rem, count);
			num2=num2/10;
		}
		if(num3==sum)
			System.out.println(i);
		}
		
		
//		else
//			System.out.println(num2+" Is not a ArmStrong Number");
	
	}
}
