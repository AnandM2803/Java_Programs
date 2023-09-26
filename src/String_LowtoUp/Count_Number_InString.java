package String_LowtoUp;

import java.util.Scanner;

public class Count_Number_InString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=48 && ch<=57)
				count++;
		}
		System.out.println(count);
	}

}
