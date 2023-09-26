package Arrays__Programs;

import java.util.Scanner;

public class averageofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the array length");
int[] arr=new int[scan.nextInt()];
int sum=0;
for(int i=0;i<arr.length;i++)
{
	System.out.println("Enter the elements to be stored in index of :"+i);
	arr[i]=scan.nextInt();
}

for(int i=0;i<arr.length;i++)
{
	sum+=arr[i];
}
int avg=sum/arr.length;
System.out.println("The average of all array elements is : "+avg);
	}

}
