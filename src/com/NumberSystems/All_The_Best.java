package com.NumberSystems;

public class All_The_Best {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="All the best";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
			int a=(int) ch+1;
			ch=(char)a;
			System.out.print(ch);
		}
			else
				System.out.print(" ");
		}
	}

}
