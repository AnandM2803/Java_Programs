package FirstMock;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int range=sc.nextInt();
		for(int i=2;i<=range;i++)
		{
			boolean flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
				flag=false;	
				break;
				}
			}
			if(flag)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}

}
