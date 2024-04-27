package number_basic;

import java.util.Scanner;

class Pattern3 {
	
	/*  1 3 5 7 9 
		3 5 7 9 
		5 7 9 
		7 9 
		9
	 */
	
	static void pattern3(int n) {
		int i, j, c1=1, c2;
		for(i=1; i<=n; i++) {
			c2 = c1;
			for(j=1; j<=n-i+1; j++) {
				System.out.print(c2 + " ");
				c2 = c2 + 2;
			}
			System.out.println();
			c1 = c1 + 2;
		}
	}
	
	static void pattern4(int n) {
		int i, j, c1=1, c2;
		for(i=1; i<=n; i++) {
			c2 = c1;
			for(j=1; j<=i; j++) {
				System.out.print(c2 + " ");
				c2 = c2 + 2;
			}c2 = c2 - 2;
			for(j=1; j<=i-1; j++) {
				c2 = c2 - 2;
				System.out.print(c2 + " ");
			}
			System.out.println();
			
		}
	}
}

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int n = sc.nextInt();
		Pattern3.pattern4(n);
	}
}
