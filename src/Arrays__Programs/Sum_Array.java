package Arrays__Programs;

import java.util.Scanner;

public class Sum_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
			System.out.println("Sum of given array elements is ="+sum);
			sc.close();
	}

}
