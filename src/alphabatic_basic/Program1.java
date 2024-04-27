package alphabatic_basic;

import java.util.Scanner;

class Pattern1 {
	
	/*  A B C D E 
		A B C D E 
		A B C D E 
		A B C D E 
		A B C D E 
	 */
	
	static void pattern1(int n) {
		int i, j;
		char ch = 'A';
		for(i=1; i<=n; i++) {
			ch = 'A';
			for(j=1; j<=n; j++) {
				System.out.print(ch + " ");
				ch++;
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
		Pattern1.pattern1(n);
	}
}
