package IF_ELSE_IF;

import java.util.Scanner;

public class ifcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);				 //To take user input using scanner class
		System.out.println("Enter the number: ");
		int a=sc.nextInt();									 //Taking an input from user as an integer
		sc.close();											 //Closing the scanner class
		
		if(a>=10 && a<=50) {								 //checks the condition
			System.out.println("No. ranges between 10 to 50");  //executed if condition is true
		}
		
		System.out.println("\nHello");
	}

}
