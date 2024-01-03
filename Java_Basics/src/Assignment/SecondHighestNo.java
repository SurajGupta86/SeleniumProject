package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestNo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements needed in an array: ");
		int n = sc.nextInt(); //Array size declared by the user
		
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element at : "+i);  //take the element as an input from the user in an array
			arr[i]=sc.nextInt();
		}
		sc.close();
		//1st method
		Arrays.sort(arr);    //Using Array collections
		System.out.println("The 2nd highest number: "+arr[n-2]);
		
		//2nd method
		int max ;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					max=arr[i];
					arr[i]=arr[j];
					arr[j]=max;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);       //print the array after sorting them in ascending order
		}
		System.out.println("The 2nd highest number in an array is: "+arr[n-2]); //Print the 2nd last element from the array which will be the second highest
	}
}
