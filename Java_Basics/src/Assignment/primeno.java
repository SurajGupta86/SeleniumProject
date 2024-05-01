package Assignment;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		int flag=0;
		if(num==0 || num==1) {
			System.out.println("THe number is not a prime number");
		}
		else {
			for(int i=2;i<num;i++){
				if((num%i)==0) {
					System.out.println("The number "+ num + " is not a prime number");
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println("The number "+ num + " is a prime number");
		}
			
	}

}
