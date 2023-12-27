package IF_ELSE_IF;

import java.util.Scanner;

public class ifelsecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);                //To take user input using scanner class
		System.out.println("Enter the number: ");
		int a=sc.nextInt();                                 //Taking an input from user as an integer
		sc.close();											//Closing the scanner class
		
		if(a%2==0) {									    //checks the condition for even number
			System.out.println(a+" is an even number");
		}
		else {												//if condition is false then else is executed
			System.out.println(a+" is an odd number");
		}
	}

}
