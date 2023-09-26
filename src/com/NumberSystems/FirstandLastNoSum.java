package com.NumberSystems;

public class FirstandLastNoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12345;
		int fd=0;
		int ld=0;
		ld=num%10;
		while(num>10)
		{
			num=num/10;
		}
		fd=num;
		System.out.println(fd+ld);
	}

}
