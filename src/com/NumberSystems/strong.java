package com.NumberSystems;

public class strong {
	// TODO Auto-generated method stub
static int fact(int d)
{
int fact=1;
for(int i=1;i<=d;i++)
{
	fact=fact*i;
}
return fact;
}
	public static void main(String[] args) {
int num=145;
int sum=0;
int temp=num;
while(num!=0)
{
	int d=num%10;
	sum=sum+fact(d);
	num=num/10;
}
if(sum==temp)

	System.out.println("It is a strong number");
else
	System.out.println(" Not a strong number");
}
	}


