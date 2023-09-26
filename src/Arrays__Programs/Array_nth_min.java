package Arrays__Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Array_nth_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n");
int n=sc.nextInt();
int[] arr= {10,20,5,7,9,25,100};
Arrays.sort(arr);
System.out.println(arr[n-1]);
	}

}
