package com.NumberSystems;

import java.util.Scanner;

public class Range_of_Primenumber {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter the Range");
//int range=sc.nextInt();
//sc.close();
//for(int i=2;i<=range;i++)
//{
//	boolean flag=true;
//	for(int j=2;j<=i/2;j++)
//	{
//		if(i%j==0)
//		{
//			flag=false;
//			break;
//		}
//	}
//	if(flag)
//		System.out.println(i);
//}
//	}
//
	
	private static boolean isPrimeNumber(int number) {
		for (int i=2; i<=number/2; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
		public static void main(String args[]) {
			int number = 2;
			int count = 0;
			long sum = 0;
			while(count < 1000) {
				if(isPrimeNumber(number)) {
					sum += number;
					count++;
				}
				number++;
			}
			System.out.println(sum);
		}	
}
