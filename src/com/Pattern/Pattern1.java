package com.Pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	System.out.print("* ");
}
sc.close();
	}

}
