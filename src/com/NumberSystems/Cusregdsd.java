package com.NumberSystems;

import java.util.Scanner;

class Cusregdsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner s=new Scanner(System.in);
System.out.println("Enter x value");
int x=s.nextInt();
s.close();
if(x>-10 && x<=9)
{
	System.out.println("single digit number");
}
else {
	System.out.println("not a single digit number");
}
	}

}
