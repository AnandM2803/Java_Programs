package Arrays__Programs;

import java.util.Scanner;

public class Array_Decleration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n");
int n=sc.nextInt();
sc.close();
int[] arr=new int[n];
System.out.println("enter the array elements");
for(int i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
	}

}
