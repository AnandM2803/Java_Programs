package Sunday_Mock;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the str1.....");
String str1=sc.nextLine();
System.out.println("Enter the str2....");
String str2=sc.nextLine();
char[] a=str1.toCharArray();
System.out.println(Arrays.toString(a));
Arrays.sort(a);
System.out.println(Arrays.toString(a));
char[] b=str2.toCharArray();
System.out.println(Arrays.toString(b));
Arrays.sort(b);
System.out.println(Arrays.toString(b));
boolean flag=true;
for(int i=0;i<a.length;i++)
{
	if(a[i]!=b[i])
		flag=false;
}
if(flag)
	System.out.println(str1+" Is a anagram ");
else
	System.out.println(str1+" Is not a anagram ");
sc.close();
	}

}
