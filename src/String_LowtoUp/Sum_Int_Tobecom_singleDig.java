package String_LowtoUp;

import java.util.Scanner;

public class Sum_Int_Tobecom_singleDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String str=sc.nextLine();
int sum = 0;
int num=0;
int ans=0;
int s=0;
for(int i=0;i<str.length();i++)
{
	char ch=str.charAt(i);
	if(ch>=48 && ch<=57)
	{
		num=(ch-48);
	ans=ans+num;
	}
	}
s=ans;
System.out.println(s);
while(s!=0)
{
	int d=s%10;
	sum=sum+d;
	s=s/10;
}
System.out.println(sum);
	}
}
