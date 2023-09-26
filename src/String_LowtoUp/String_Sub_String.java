package String_LowtoUp;

import java.util.Arrays;
import java.util.Scanner;

public class String_Sub_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String str=sc.nextLine();
System.out.println("Enter the Sub String");
String sub=sc.next();
String arr[]=str.split(sub);
System.out.println(Arrays.toString(arr));
if(str.startsWith(sub) && str.endsWith(sub))
	System.out.println(arr.length);
else if(str.startsWith(sub))
	System.out.println(arr.length-1);
else if(str.endsWith(sub))
	System.out.println(arr.length);
else
	System.out.println(arr.length-1);
	}

}
