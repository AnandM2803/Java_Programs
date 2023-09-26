package com.NumberSystems;

import java.util.Scanner;

public class Rev_Sentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentance=");
		String s=sc.nextLine();
		String[] str=s.split(" ");
		String rev="";
		for(int i=str.length-1;i>=0;i--)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
				rev=rev+str[i].charAt(j);
			}
			rev=rev+" ";
		}
	System.out.println(rev);
	sc.close();
	}
	

}
