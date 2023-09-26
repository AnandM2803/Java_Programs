package FirstMock;

import java.util.Scanner;

public class String_10 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
String[] str=new String[10];
int count=0;
for(int i=0;i<str.length;i++)
{
	 str[i] =sc.nextLine();
	 count++;
}
for(int i=0;i<str.length;i++)
{
	System.out.println(str[i]);
}
System.out.println(count);

	}

}
