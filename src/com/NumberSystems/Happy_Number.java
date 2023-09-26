package com.NumberSystems;

import java.util.Scanner;

public class Happy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num");
int rem;
//int sum=0;
int num=sc.nextInt();
int copy=num;
sc.close();
/*while(num>9){
	while(num>0){
	rem=num%10;
	sum=sum+(rem*rem);
	num=num/10;
}
	num=sum;
	sum=0;
}*/
while(num>9)
{
	int sum=0;
	do
	{
		int d=num%10;
		sum=sum+d*d;
		num=num/10;
	}
	while(num!=0);
	{
		num=sum;
	}
}
if(num==1||num==7){
	System.out.println(copy+"=is Happy number");
}
else
{
	System.out.println(copy+"=is Not happy number");
}

	}

}
