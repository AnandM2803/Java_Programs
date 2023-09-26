package Arrays__Programs;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfMINandMAXArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the elements to be stored in index of : "+i);
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int output[]=new int[3];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		output[0]=arr[0];
		output[1]=arr[arr.length-1];
		output[2]=arr[0]+arr[arr.length-1];
		System.out.println(Arrays.toString(output));
	}
}
