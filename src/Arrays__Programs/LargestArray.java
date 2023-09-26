package Arrays__Programs;

import java.util.Scanner;

public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length");
		int[] arr=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the elements to be stored in index of :"+i);
			arr[i]=scan.nextInt();
		}
		int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				largest=arr[i];
			}
		}
		System.out.println("the laregst element in given array is : "+largest);
	}

}
