package number_advance;

import java.util.Scanner;

class Pattern2 {
	/*        1 
          4   9 
      16 25  36 
   49 64 81 100 
	 * */
	static void pattern1(int n) {
		int i, j, c=1;
		for(i=1; i<=n; i++) {
			for(j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(j=1; j<=i; j++) {
				System.out.print(c*c + " ");
				c++;
			}
			
			System.out.println();
		}
	}
	/*
	           15 
            14 13 
         12 11 10 
       9  8  7  6 
    5  4  3  2  1 
   */
	static void pattern2(int n) {
		int i, j, f=0;
		for(i=n; i!=0; i--) {
			f = f + i; 
		}
		for(i=1; i<=n; i++) {
			for(j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(j=1; j<=i; j++) {
				System.out.print(f + " ");
				f--;
			}
			
			System.out.println();
		}
	}
	/*  1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5 
		1 2 3 4 
		1 2 3 
		1 2 
		1
   */
	static void pattern3(int n) {
		int i, j;
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(i=1; i<n; i++) {
			for(j=1; j<=n-i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	/*  4 3 2 1 0 
		3 2 1 0 1 
		2 1 0 1 2 
		1 0 1 2 3 
		0 1 2 3 4 
	*/
	static void pattern4(int n) {
		int i, j;
		for(i=1; i<=n; i++) {
			for(j=n-i; j>=0; j--) {
				System.out.print(j + " ");
			}
			for(j=1; j<i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int n = sc.nextInt();
		Pattern2.pattern4(n);
	}
}
