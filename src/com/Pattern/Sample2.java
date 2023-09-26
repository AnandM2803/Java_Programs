package com.Pattern;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		for (int i = 1; i<=5; i++) {
			for (int j = 1;j<=i; j++) {
				System.out.print(n--+" ");
			}
			System.out.println();
		}
	}

}
