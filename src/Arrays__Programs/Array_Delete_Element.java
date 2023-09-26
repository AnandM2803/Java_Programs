package Arrays__Programs;

import java.util.Scanner;

public class Array_Delete_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of n");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array");
		for (int i = 0; i < arr.length; i++) {
			 arr[i]=sc.nextInt();
		}
int y=0;
System.out.println("Enter the value to be remove");
int x=sc.nextInt();
sc.close();
int[] res=new int[arr.length-1];
for (int i = 0; i < arr.length; i++) {
	if(arr[i]!=x)
	{
		res[y]=arr[i];
		y++;
	}
}
for (int i = 0; i < res.length; i++) {
	System.out.println(res[i]);
}
	}

}
