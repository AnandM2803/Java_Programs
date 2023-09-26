package Arrays__Programs;

import java.util.Scanner;

public class Array_Delete_onIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of n");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array");
		for (int i = 0; i < arr.length; i++) {
			 arr[i]=sc.nextInt();
		}
	int y=0;
	System.out.println("Enter the Index value");
	int index=sc.nextInt();
	int[] res=new int[arr.length-1];
	for (int i = 0; i < arr.length; i++) {
		if(i!=index)
		{
			res[y]=arr[i];
			y++;
		}
	}
	for (int i = 0; i < res.length; i++) {
		System.out.println(res[i]);
	}
	sc.close();
}
}