package com.NumberSystems;

import java.util.Scanner;

public class Dynamictables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value a");
int a=sc.nextInt();
for(int i=1;i<=10;i++)
{
	System.out.println(a+"*"+i+"="+a*i);
}
sc.close();
	}

}
