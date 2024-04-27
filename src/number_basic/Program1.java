package number_basic;

import java.util.Scanner;

class Pattern1 {
	
	static void patter1(int n) {
		int i, j;
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	static void patter2(int n) {
		int i, j, c;
		for(i=1; i<=n; i++) {
			c = i;
			for(j=1; j<=n; j++) {
				System.out.print(c++ + " ");
			}
			System.out.println();
		}
	}
	
}


public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int n = sc.nextInt();
		Pattern1.patter2(n);
	}
}
