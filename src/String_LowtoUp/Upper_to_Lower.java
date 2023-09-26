package String_LowtoUp;

import java.util.Scanner;

public class Upper_to_Lower {

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
			if(ch>=65 && ch<=90)
			{
			int x=(int)ch;
			ans=ans+(char) (x+32);
		}
			else
				ans=ans+ch;
		}
		System.out.println(ans);
	}

}
