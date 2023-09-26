package com.Pattern;

import java.util.Scanner;

public class A_Z_Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character ");
		char ch = sc.next().charAt(0);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		sc.close();
		switch (ch)
		{
		case 'A':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == 1 || j == 1 || j == n || i == (n / 2) + 1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'B':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					//if (i == 1 || j == 1 || j == n || i == (n / 2) + 1 || i==n)
					if(j==1 || (i==1 && j<n) || ( i==(n/2)+1 && j<n) || (i==n && j<n) || (j==n && i%2==0))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'C':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					//if (i==1 || j==1 || i==n)
					if((i==1 && j>1) || (j==1 && i>1 && i<n) || (i==n && j>1))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'D':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					//if (i==1 || j==1 || i==n || j==n)
					if((i==1 && j<n) || j==1 || (i==n && j<n) || (j==n && i>1 && i<n))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'E':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == 1 || j ==1 || i==n || (i==(n/2)+1&& j<n))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'F':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == 1 || j ==1 || (i==(n/2)+1 && j<n))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'G':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if(i==1 || j==1 || i==n || (j==n && i>=(n/2)+1) || (i==(n/2)+1 && j>=3))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'H':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j==1 || j==n || i==(n/2)+1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'I':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i==1 || i==n || j==(n/2)+1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'J':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if( i==1 ||j==(n/2)+1 || (i==n && j<=(n/2)+1) || (j==1 && i>=(n/2)+1))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'K':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j==(n/2)+1 || (i+j==n+1 && i<=(n/2)+1) || (i==j && i>=(n/2)+1))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'L':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j==1 || i==n)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'M':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j==1 || j==n || (i==j && i<=(n/2)+1) || (i+j==n+1 && j>=(n/2)+1))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'N':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j==1 || i==j || j==n)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'O':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if ((i==1 && j>1 && j<n) || (j==1 && i>1 && i<n) || (i==n && j>1 && j<n) || (j==n && i>1 && i<n))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'P':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j==1 || (i==1 && j<=(n/2)+1) || (j==(n/2)+1 && i<=(n/2)+1) || i==(n/2)+1 && j<=(n/2)+1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'Q':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if ((i==1 && j>1 && j<n) || (j==1 && i>1 && i<n) || (i==n && j>1 && j<n) || (j==n && i>1 && i<n) || (i==j && i>=(n/2)+1))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'R':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j==1 || (i==1 && j<n) || (i==(n/2)+1 && j<n) || (i==j && j>=(n/2)+1) || (j==n-1 && i<=(n/2)+1))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'S':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i==1 || (j==1 && i<=(n/2)+1) || i==(n/2)+1 || (j==n && i>=(n/2)+1) || i==n)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'T':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i==1 || j==(n/2)+1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'U':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if ((j==1 && i>1 && i<n) || (i==n && j>1 && j<n) || (j==n && i>1 && i<n))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'V':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if ((i==j && i<=(n/2)+1) || (i+j==n+1 && j>=(n/2)+1))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'W':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j==1 || (i+j==n+1 && j<=(n/2)+1) || (i==j && j>=(n/2)+1) || j==n)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'X':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i==j || i+j==n+1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'Y':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					//if (i+j==n+1 || (i==j && i<=(n/2)+1))
						if((i==j && i<=(n/2)+1) || (i+j==n+1 && i<=(n/2)+1) ||(j==(n/2)+1 && i>=(n/2)+1))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
		case 'Z':
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i==1 || i==n || i+j==n+1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			break;
			default :System.out.println("Invalid data");
			break;
		}
	}

}
