package Assignment;

import java.util.Scanner;

public class FiboCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print fibo series: ");
		int n = sc.nextInt();
		int a=0,b=1;   //Initialize first 2 numbers of fibo series
		System.out.print("The fibonacci series:");
		for(int i=0;i<n;i++) {
			System.out.print("\t"+a);
			int temp=a+b;
			a=b;
			b=temp;
		}
	}

}
