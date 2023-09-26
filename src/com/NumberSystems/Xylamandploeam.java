package com.NumberSystems;

import java.util.Scanner;

public class Xylamandploeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Enter the num");
int num=sc.nextInt();
int temp=num;
int usum=0;
int isum=0;
while(num!=0)
{
	if(num==temp||num<=9)
	{
		usum=usum+num%10;
	}
	else
	{
		isum=isum+num%10;
	}
	num=num/10;
}
if(isum==usum)
{
	System.out.println(temp+" is xyleam");
}
else
	System.out.println(temp+" is a poleam");
	}

}
