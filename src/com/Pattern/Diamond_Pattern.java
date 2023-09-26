package com.Pattern;

public class Diamond_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=7;
 int star=1;
 int space=n/2;
 for(int i=1;i<=n;i++)
 {
	 for(int j=1;j<=space;j++) {
			 System.out.print(" ");
	 }
	 for(int k=1;k<=star;k++)
	 {
		 if(k%2==0)
			 System.out.print("- ");
	 }
	 System.out.println();
	 if(i<=n/2) {
		 star=star+2;
		 space--;
	 }
	 else {
		 star=star-2;
		 space++;
	 }
 }
	}

}
