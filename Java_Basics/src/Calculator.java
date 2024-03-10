import java.util.Scanner;

public class Calculator {

	public static void main(String[] adjn) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the calculator \n");
		//System.out.println();
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the 1st number: ");
		int a=sc.nextInt();
		System.out.print("\r\nEnter the 2nd number: ");
		int b=sc.nextInt();
		sc.close();
		
		Calculator obj= new Calculator();                //Created object1
		Calculator obj1= new Calculator();  		     //Created object2
		Calculator obj2= new Calculator();  			 //Created object3
		Calculator obj3= new Calculator();  			 //Created object4 
		
		
		obj.Add(a, b);           					//Calling a method by passing parameter
		
		System.out.println(obj1.Sub(a, b));
		
		System.out.println("Multiplication of 2 number is: "+obj2.Mul(a, b));
		
		System.out.println("Division of 2 number is: "+obj3.Div(a, b));
	}
	
	public void Add(int a, int b)   //Using Void and not returning any value instead printing.
	{
		int c=a+b;
		System.out.println();       //Adding empty line between 2 statements
		System.out.println("Addition of 2 number is:"+' '+c);
	}
	public String Sub(int a, int b)    //Using String and returning a string with value.
	{
		
		int c=a-b;
		return ("Subtraction of 2 number is:"+' '+c);
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
