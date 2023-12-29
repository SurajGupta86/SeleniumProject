package Assignment;

import java.util.Scanner;

public class Swap2noUsingMethod {
	public void swap(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping:"+"a = "+a+" b = "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vaue of a & b: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		
		System.out.println("Before swapping:"+"a = "+a+" b = "+b);
		
		Swap2noUsingMethod obj = new Swap2noUsingMethod();
		obj.swap(a,b);
	}

}
