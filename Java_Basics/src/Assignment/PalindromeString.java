package Assignment;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse: ");
		String s = sc.next();
		String ss=s;
		String s1="";
		sc.close();
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		//Print the string in reverse order
		System.out.println("Reversed string: "+s1);
		
		//Check if the given string is a palindrome
		if(s1.equals(s)) {
			System.out.println("The given string is a palindrome");
		}
		else {
			System.out.println("The given string is not a palindrome");
		}
	
	}

}
