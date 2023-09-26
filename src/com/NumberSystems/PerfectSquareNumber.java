package com.NumberSystems;

import java.util.Scanner;

public class PerfectSquareNumber {

	static void perfectSquNumber(int num)
	{
		int no=(int) Math.sqrt(num);
		if(num==(no*no))
			System.out.println(num+" is a Perfect Square Number");
		else
			System.out.println(num+" is not a Perfect Square Number");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num");
int num=sc.nextInt();
perfectSquNumber(num);
	}

}
