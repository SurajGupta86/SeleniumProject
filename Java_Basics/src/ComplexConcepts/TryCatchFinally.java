package ComplexConcepts;

import java.util.Scanner;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//String s= new String();
		System.out.println("Enter the name: "); 
		String s = sc.nextLine();  //read strings
		System.out.println("Enter the number: ");        
		int a=sc.nextInt();
		sc.close();
	
		try {
			int c=115/a;
			System.out.println(c);
		}
		catch(Throwable t){
			System.out.println(t.getMessage());
			t.printStackTrace();
		}
		finally {                                   // It will print irrespective of the condition getting true or false.
			System.out.println("Print something finally");
		}
		
		System.out.println("Irrespective of error occured");
	}

}
