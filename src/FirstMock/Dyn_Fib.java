package FirstMock;

import java.util.Scanner;

public class Dyn_Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n");
int n=sc.nextInt();
int count=0;
int f1=0;
int f2=1;
int f3 = 0;
for(int i=2;i<=n;i++)
{
	f3=f1+f2;
	f1=f2;
	f2=f3;
	count++;
}
		System.out.println(f3);
}

}
