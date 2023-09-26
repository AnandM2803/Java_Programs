package FirstMock;

import java.util.Scanner;

public class Perfect {
	static int per(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int num = sc.nextInt();
		int copy = num;
		int x = per(num);
		if (x == copy) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		sc.close();
	}

}
