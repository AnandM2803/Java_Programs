package FirstMock;

import java.util.Scanner;

public class Tables {
static void tab(int a)
{
	for(int i=1;i<=10;i++)
	{
		System.out.println(a+"*"+i+"="+a*i);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
tab(a);
sc.close();
	}

}
