package IF_ELSE_IF;

import java.util.Scanner;

public class ifelseifcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);                //To take user input using scanner class
		System.out.println("Enter the number: ");
		int marks=sc.nextInt();                                 //Taking an input from user as an integer
		sc.close();	
		
		//Using if-elseif for checking multiple conditions
		if(marks>75 && marks<=100) {
			System.out.println("Distinct");
		}
		else if(marks>60 && marks<=75) {
			System.out.println("First class");
		}
		else if(marks>50 && marks<=60) {
			System.out.println("Second Class");
		}
		else if(marks>35 && marks<=50) {
			System.out.println("Average");
		}
		else {
			System.out.println("Fail");
		}
	}

}
