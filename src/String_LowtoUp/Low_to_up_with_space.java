package String_LowtoUp;

import java.util.Scanner;

public class Low_to_up_with_space {

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
			if(str.charAt(i)==' ')
			{
				ans=ans+" ";
			}
			else
			{
				int x=(int)ch;
			ans=ans+(char) (x-32);
			}
		}
		System.out.println(ans);
	}

}
