package com.NumberSystems;

public class Sum_perfect_inarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,28,6,7,9};
int sum=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]%i==0)
	{
		sum=sum+arr[i];
	}
}
System.out.println(sum);
	}

}
