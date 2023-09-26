package Arrays__Programs;

import java.util.Scanner;

public class SecHigestArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
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
		
			System.out.println("The second largest Array element is "+arr[arr.length-2] + " and it's length is "+ arr[size-3]);
		

	}

}
