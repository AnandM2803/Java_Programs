package com.NumberSystems;

class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int f1=0;
int f2=1;
int f3;
System.out.println(f1+" "+f2+"");
for(int i=2;i<=14;i++)
{
	f3=f1+f2;
	System.out.print(f3+" ");
	f1=f2;
	f2=f3;
}
	}

}
