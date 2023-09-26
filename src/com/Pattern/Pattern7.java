package com.Pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
	}
		sc.close();
	}

}
