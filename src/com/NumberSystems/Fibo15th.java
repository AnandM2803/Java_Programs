package com.NumberSystems;

class Fibo15th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0;
		int f2=1;
		int f3=0;
		System.out.println(f1+" "+f2+"");
		for(int i=2;i<=14;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		System.out.print(f3+" ");
	}

}