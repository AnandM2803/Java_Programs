package com.programming;

class Plaindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mom";
		String copy=str;
		String rev ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(copy.equals(rev))
		{
			System.out.println("String is Plaindram");
		}
			else
			{
			System.out.println("String is not panaindram");
			}
		}
	}




