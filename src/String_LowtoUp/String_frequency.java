package String_LowtoUp;

import java.util.Scanner;

public class String_frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
String s[]=str.split("");
int count=1;
for(int i=0;i<s.length;i++)
{
	for(int j=i+1;j<s.length;j++)
	{
		if(s[i].equals(s[j]) && s[i]!="")
		{
			s[j]="";
			count++;
		}
	}
	if(count >1 || s[i]!="")
	{
		System.out.println(s[i]+""+count);
		s[i]="";
	}
	count=1;
}
	}

}
