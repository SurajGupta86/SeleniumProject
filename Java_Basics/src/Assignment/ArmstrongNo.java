package Assignment;

import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int p=String.valueOf(n).length();
		int rem,sum=0;
		int temp=n;
		while(n>0) {
			rem=(n%10);
			sum =(int) (sum+Math.pow(rem,p));
			n=n/10;
		}
		if(sum==temp){
			System.out.println(sum+" is an armstrong no.");
		}
		else {
			System.out.println(sum+" is not an armstrong no.");
		}
	}

}
