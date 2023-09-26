package com.NumberSystems;

public class Numofdigitsinnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1456;
int count=0;
while(num!=0)
{
	num=num/10;
	count++;
}
System.out.println("Number of digits in given number="+count);
	}

}
