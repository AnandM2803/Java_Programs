package com.NumberSystems;

import java.util.Scanner;

public class Print_Biggestnum_in3number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		System.out.println("Enter the value of c");
		int c=sc.nextInt();
		sc.close();
		int big=a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
		System.out.println(big+"=is biggest number in three numbers");
	}

}
