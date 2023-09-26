package com.NumberSystems;

import java.util.Scanner;

public class Range_Happy_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		int rem,sum=0;
		System.out.println("Enter n");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=range;i++)
		{
		int num=i;
		sc.close();
		while(num>9){
			while(num>0){
			rem=num%10;
			sum=sum+(rem*rem);
			num=num/10;
		}
			num=sum;
			sum=0;
		}
		if(num==1||num==7){
		//System.out.println(i);
			count++;
			if(count==n)
				System.out.println(i);
		}
		
	}
	}
}
