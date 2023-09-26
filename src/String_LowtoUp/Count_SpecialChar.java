package String_LowtoUp;

import java.util.Scanner;

public class Count_SpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>='A' && ch<='Z')  ||(ch>='a' && ch<='z')||(ch>=48 && ch<=57))
			{
				
			}
			else
				count++;
		}
		System.out.println(count);
	}

}
