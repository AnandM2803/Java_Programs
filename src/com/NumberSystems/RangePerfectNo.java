package com.NumberSystems;

import java.util.Scanner;

public class RangePerfectNo {

	static boolean isPerferctNo(int num)
	{
	int sum=0;
	for(int i=1;i<=num/2;i++)
	{
		if(num%i==0)
			sum+=i;
	}
	return num==sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range");
int range=sc.nextInt();
for(int i=1;i<=range;i++)
{
	if(isPerferctNo(i))
		System.out.println(i);
}
	}

}
