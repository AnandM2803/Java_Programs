package com.NumberSystems;

public class PrintAaZBbYCcX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		char ch1='a';
		char ch2='Z';
		for(int i=1;i<=26;i++)
		{
			System.out.println(ch+""+ch1+""+ch2);
			ch++;
			ch1++;
			ch2--;
		}
	}

}
