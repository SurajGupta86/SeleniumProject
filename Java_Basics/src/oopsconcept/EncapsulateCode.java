package oopsconcept;

import java.util.Scanner;

public class EncapsulateCode {
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Account No: ");
		int m=sc.nextInt();  // Take a user input for Account no.
		
		System.out.println("Enter the Pin No: ");
		int n=sc.nextInt();  // Take a user input for Pin No.
		
		System.out.println("Enter the amount to be withdrawn: ");
		int o=sc.nextInt();  // Take a user input for amount to be withdrawn.
		
		sc.close();
		
		BaseClass obj=new BaseClass(); //Create an object from the BaseClass.
		
		
//		obj.setAccNumber(m);             //Calling a method to give the input as a Account No.
//		int a=(obj.getAccNumber());		 //Calling a method to print the entered Account No. 
//		System.out.println("Please show the Account Number: "+a);
//		
		
//		obj.setPinNo(n);                //Calling a method to give the input as a Pin No.
//		int b=(obj.getPinNo());			//Calling a method to print the entered Pin No.
//		System.out.println("Please show the Pin number: "+b);
		
		obj.Withdraw(m,n,o);   //Calling a Login method written in BaseClass so here Encapsulation is used
		//obj.Withdraw(1234,2468,18000);
		
		
	}
	
}
