package Two_D_Array;

import java.util.Scanner;

public class Column_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row...");
		int row = sc.nextInt();
		System.out.println("Enter the col...");
		int col = sc.nextInt();
		System.out.println("Enter " + row * col + " elements");
		int arr[][] = new int[row][col];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				sum = sum + arr[j][i];

			}
			System.out.println("row sum" + "=" + sum);
			System.out.println();
			sum = 0;

		}
	}

}
