package com.NumberSystems;

import java.util.Scanner;

public class Print_NpowerP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of Base");
int base=sc.nextInt();
System.out.println("Enter the value of Exp");
int exp=sc.nextInt();
int prod=1;
sc.close();
while(exp!=0)
{
	prod=prod*base;
	exp--;
}
System.out.println(prod);
	}

}
