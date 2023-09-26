package com.NumberSystems;

import java.util.Scanner;

public class Mirrior_Sentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Sentance=");
String s=sc.nextLine();
String[] str=s.split(" ");
String rev="";
for(int i=str.length-1;i>=0;i--)
{
	rev=rev+str[i]+" ";
}
System.out.println(rev);
sc.close();
	}

}
