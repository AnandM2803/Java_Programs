package String_LowtoUp;

import java.util.Scanner;

public class Lower_Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String ans="";
		sc.close();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int x=(int)ch;
			ans=ans+(char) (x-32);
		}
		System.out.println( "Upper case is"+" "+ans);
	}

}
