package String_LowtoUp;

import java.util.Scanner;

public class Str_plaindrome_without_for_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String str=sc.nextLine();
int i=0;
int j=str.length()-1;
int n=str.length();
boolean flag=true;
sc.close();
while(i<=n/2)
{
	if(str.charAt(i)!=str.charAt(j))
	{
		flag=false;
		break;
	}
	i++;
	j--;
}
if(flag)
	System.out.println("Is plaindrome");
else
	System.out.println("Is not a plaindrome");
	}

}
