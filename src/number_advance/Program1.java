package number_advance;

import java.util.Scanner;

class Pattern1 {
	/*   1  2  3  4  5 
		10  9  8  7  6 
   		11 12 13 14 15 
		20 19 18 17 16 
		21 22 23 24 25 
    */
	static void pattern1(int n) {
		int i, j, c=1, t;
		for(i=1; i<=n; i++) {
			t = c - 1 + n;
			for(j=1; j<=n; j++) {
				if(i%2!=0)System.out.print(c + " ");
				else System.out.print(t-- + " ");
				c++;
			}
			System.out.println();
		}
	}
	
	/*  1 10 11 20 21 
		2  9 12 19 22 
		3  8 13 18 23 
		4  7 14 17 24 
		5  6 15 16 25 */
	
	static void pattern2(int n) {
		int i, j, c;
		for(i=1; i<=n; i++) {
			c = i;
			for(j=1; j<=n; j++) {
				if(j%2 != 0) System.out.print(c + " ");
				else System.out.print(((j*5)+1-i) + " ");
			    c = c + 5;
			}
			System.out.println();
		}
	}
	
	/*  5 6 15 16 25 
		4 7 14 17 24 
		3 8 13 18 23 
		2 9 12 19 22 
		1 10 11 20 21 
    */
	
	static void pattern3(int n) {
		int i, j, c;
		for(i=1; i<=n; i++) {
			c = n-i+1;
			for(j=1; j<=n; j++) {
				if(j%2 != 0) System.out.print(c + " ");
				else System.out.print(((j*5)-n+i) + " ");
			    c = c + 5;
			}
			System.out.println();
		}
	}
	/*
	    1 2 3 4 5 
		1 2 3 4 
		1 2 3 
		1 2 
		1
 */
	static void pattern4(int n) {
		int i, j;
		for(i=1; i<=n; i++) {
			for(j=1; j<=n-i+1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		Pattern1.pattern4(n);
	}
}
