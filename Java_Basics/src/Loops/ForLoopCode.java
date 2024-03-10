package Loops;

import java.util.Scanner;

public class ForLoopCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number to print pattern: ");
		int n=sc.nextInt();
		sc.close();
		 //outer loop to handle rows
		for(int i=1;i<=n;i++){                          
			// inner loop to handle columns
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();	       // printing new line for each row 
		}
		
		// outer loop to handle rows
		for(int i=1;i<=n;i++){                          
			// inner loop to handle columns
			for(int j=n;j>=i;j--) {
				System.out.print('*');
			}
				System.out.println();	       // printing new line for each row 
		}
		
	}

}
