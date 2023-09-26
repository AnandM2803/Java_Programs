package com.NumberSystems;

import java.util.Scanner;

public class NthPrimeNo {

	static int nthprime(int range,int nthp)
	{
		int count=0;
		int prime=0;
		for(int i=2;i<=range;i++)
		{
			boolean flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				count++;
				
				if(count==nthp)
				{
					prime=i;
				}
			}
		}
		return prime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enther the range");
		int range=sc.nextInt();
		System.out.println("Enter the Nth prime number");
		int nthp=sc.nextInt();
		System.out.println(nthprime(range,nthp));
	}

}
