package Sunday_Mock;

import java.util.Scanner;

public class Range_ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter range");
int range=sc.nextInt();
sc.close();
for(int i=1;i<=range;i++)
{
	int num=i;
	int sum=0;
	int copy=num;
	while(num!=0)
	{
		int d=num%10;
		sum=sum+power(d,count(copy));
		num=num/10;
	}
	if(sum==copy)
		System.out.println(i);
}

	}
	static int power(int base,int exp)
	{
		int pro=1;
		while(exp!=0)
		{
			pro=pro*base;
			exp--;
		}
		return pro;
	}
	static int count(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}

}
