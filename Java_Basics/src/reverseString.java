import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the string to be reversed: ");
		String str= sc.nextLine();    //Take a string as a input from the user
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev =rev + str.charAt(i);
		}
		char c=sc.next().charAt(0);    //Take a character as a input from the user
		sc.close();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==c) {
				count+=1;         //Keeps on iterating when the character from string matches with the required character
			}	
		}
		System.out.println("The count of "+c+" in the string is "+count);
		System.out.println("The reversed string is: "+rev);
		System.out.println("The total length of the string is: "+rev.length());

	}

}
