package Sunday_Mock;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
String str1,str2;
str1="";
str2="";
for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)=='#')
	{
		str1+=""+str.charAt(i);
	}
	else
		str2+=""+str.charAt(i);
}
System.out.println(str1+str2);
sc.close();
	}

}
