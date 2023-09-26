package com.NumberSystems;

public class Sumofodddigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6546556;
		int sum=0;
		while(num!=0)
		{
			int d=num%10;
			if(num%2!=0)
			sum=sum+d;
			num=num/10;
		}
		System.out.println("sum of even digits in given number="+sum);
	}

}
