package com.NumberSystems;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of num");
int num=sc.nextInt();
int rev=0;
sc.close();
while(num!=0)
{
	int d=num%10;
	rev=rev*10+d;
	num=num/10;
}
System.out.println(rev);
	}

}
