package star_pattern;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int j;
		for(int i=1; i<=size; i++) {
			for(j=size-i; j>=1; j--) {
				System.out.print("  ");
			}
			for(j=1; j<i; j++) {
				System.out.print(" *");
			}
			for(j=1; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1; i<size; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for(j=size-i; j>=1; j--) {
				System.out.print(" *");
			}
			for(j=size-i-1; j>=1; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
}
