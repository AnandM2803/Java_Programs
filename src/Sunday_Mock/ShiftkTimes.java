package Sunday_Mock;

import java.util.LinkedList;
import java.util.Scanner;

public class ShiftkTimes {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int k=sc.nextInt();
		LinkedList l=new LinkedList();
		l.add(1);
		l.add(3);
		l.add(4);
		l.add(4);
		for(int i=0;i<k;i++)
		{
			Object a=l.pollLast();
			
		}   
	}
}
