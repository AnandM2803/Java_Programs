package com.programming;

public class Duplicate2 
{
	public static void main(String[] args) 
	{
		 String s="Hey Hey I I am Ram Ram";
	       s=s.toLowerCase();
	String[] str=s.split(" ");
	for(int i=0;i<str.length;i++)
	{
		for(int j=i+1;j<str.length;j++)
		{
			if(str[i].equals(str[j]))
			{
				str[j]="0";
			}
		}
		if(str[i]!="0")
		{
			System.out.print(str[i]+" ");
		}
	}
		}


	}
