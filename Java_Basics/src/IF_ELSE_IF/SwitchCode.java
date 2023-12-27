package IF_ELSE_IF;

import java.util.Scanner;

public class SwitchCode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the calculator \n");
		//System.out.println();
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the 1st number: ");
		int a=sc.nextInt();
		System.out.print("\r\nEnter the 2nd number: ");
		int b=sc.nextInt();
		System.out.println();
		System.out.println("Enter any number between 1 to 4 to perform specific operation\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
		int num=sc.nextInt();
		sc.close();
		
		SwitchCode obj= new SwitchCode(); 
		
		switch(num) {
		case 1: obj.Add(a, b);
				break;
		case 2: System.out.println("Subtraction of 2 number is: "+obj.Sub(a, b));
				break;
		case 3: System.out.println("Multiplication of 2 number is: "+obj.Mul(a, b));
				break;
		case 4: System.out.println("Division of 2 number is: "+obj.Div(a, b));
				break;
		default: System.out.println("Please input the number between 1 to 4 for a particular operation");
		
		}

	}
	
	public void Add(int a, int b)   //Using Void and not returning any value instead printing.
	{
		int c=a+b;
		System.out.println();       //Adding empty line between 2 statements
		System.out.println("Addition of 2 number is:"+' '+c);
	}
	
	public int Sub(int a, int b)    //Using String and returning a string with value.
	{
		
		int c=a-b;
		return c;
	}
	
	public int Mul(int a, int b)
	{
		int c=a*b;
		return c;
	
	}
	
	public float Div(int a, int b) 
	{
		float c= ((float)a/b);
		//System.out.println(String.format("%.2f", c));
		return c;
	}

}
