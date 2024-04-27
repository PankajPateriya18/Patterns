package number_basic;

import java.util.Scanner;

class Pattern2 {
	
	/* 1  2  3
	 * 6  5  4
	 * 7  8  9
	 * 12 11 10
	 * 13 14 15
	 * */
	
	static void pattern1() {
		int i, j, t, l = 6, b = 3, c=1;
		for(i=1; i<=l; i++) {
			t = c+b-1;
			for(j=1; j<=b; j++) {
				if(i%2 != 0) System.out.print(c + " ");
				else System.out.print(t-- + " ");
				c++;
			}
			System.out.println();
		}
	}
	
	/*  1 2 3 4 5 
		2 4 6 8 10 
		3 6 9 12 15 
		4 8 12 16 20 
		5 10 15 20 25 
	 * */
	static void pattern2(int n) {
		int i, j;
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				System.out.print((i*j) + " ");
			}
			System.out.println();
		}
	}
	/*  1 2 3 4 5 
		2 3 4 5 1 
		3 4 5 2 1 
		4 5 3 2 1 
		5 4 3 2 1 */
	static void pattern3(int n) {
		int i, j;
		for(i=1; i<=n; i++) {
			for(j=i; j<=n; j++) {
				System.out.print(j + " ");
			}
			for(j=i-1; j>=1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
}

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = sc.nextInt();
//		Pattern2.pattern1();
		Pattern2.pattern3(n);
	}
}
