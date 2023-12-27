package Abs_InterfacesCode;

import java.util.Scanner;

public class Abs_Code extends AbstractionCode{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to update: ");
		String s = sc.nextLine();  //To take string as a input
		
		Abs_Code obj = new Abs_Code();  //Create an object of Concrete Class because we cannot create an object for abstract class
		obj.open();  //Calling a methods
		obj.read();
		obj.update(s);
		
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Please open the book");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Read the particular sentence");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Once reading is done, Close the book");	
	}

}
