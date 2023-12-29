package Assignment;

import java.util.Scanner;

public class SecondHighestNo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements needed in an array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element at : "+i);
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}	
		}
		System.out.println("The maximum number in an array is: "+max);
	}
}
