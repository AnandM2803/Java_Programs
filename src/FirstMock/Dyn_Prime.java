package FirstMock;

import java.util.Scanner;

public class Dyn_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
int n=sc.nextInt();
int count=0;
for(int i=2;i<=100;i++)
{
	boolean flag=true;
	for(int j=2;j<=i/2;j++)
	{
		if(i%j==0)
			
			flag=false;
		break;
	}
	if(flag)
	{
		count++;
		if(count==n)
			System.out.println(i);
	}
	
}

	}

}
