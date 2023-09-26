package Sunday_Mock;

import java.util.Scanner;

public class Range_perfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter range");
int range=sc.nextInt();
for(int i=1;i<=range;i++)
{
	int num=i;
	int sum=0;
	for(int j=1;j<=num/2;j++)
	{
		if(num%j==0)
		{
			sum=sum+j;
		}
		
	}
	if(sum==num)
		System.out.println(i);
}
sc.close();
	}

}
