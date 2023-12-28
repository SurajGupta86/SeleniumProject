// Java Program to Swap
// Two Numbers using Two
// Variables
import java.io.*;

// Driver Class
public class Swap2No {
	// main function
	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;

		// print statement
		System.out.println("Before swapping, a = " + a
						+ " and b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping, a = " + a
						+ " and b = " + b);
	}
}
