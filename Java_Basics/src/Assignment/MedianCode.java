package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class MedianCode {
	
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
//		Arrays.sort(arr);    //Using Array collections
//		System.out.println("The 2nd highest number: "+arr[n-2]);
		
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
		
		//The elements are even then if will execute
		if(n%2==0) {
			System.out.println("The median of the even number is : "+(float)(arr[(n/2)-1]+arr[((n+2)/2)-1])/2);       //Since Array starts with index '0'
		}
		//The elements are odd then else will execute
		else {
			
			System.out.println("The median of the given array is : "+arr[(n)/2]);
		}
	}
}
