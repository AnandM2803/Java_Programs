package com.NumberSystems;

import java.util.Scanner;

public class Special_Twodigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of num");
int num=sc.nextInt();
int d1=num%10;
int d2=num/10;
int sum=d1+d2+d1*d2;
sc.close();
if(sum==num)
System.out.println(sum+"=Is a special two digit number");
else 
	System.out.println(sum+"=is not special two digit number");
	}

}
