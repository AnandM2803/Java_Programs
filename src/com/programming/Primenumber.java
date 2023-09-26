package com.programming;



class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=6;
boolean flag=true;
for(int i=2;i<a;i++)
{
	if(a%i==0)
	{
		flag=false;
		break;
	}
}
if(flag==true)
{
	System.out.println("prime number");
}
else
{
	System.out.println("not a prime number");
}

	}

}
