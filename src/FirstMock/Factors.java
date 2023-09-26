package FirstMock;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
int num=sc.nextInt();
for(int i=1;i<=num/2;i++)
{
	if(num%i==0)
	{
		System.out.println(i);
	}
}
sc.close();
	}

}
