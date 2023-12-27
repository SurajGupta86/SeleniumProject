import java.util.Scanner;

public class ArrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,12,18,10,15,20,25,30,35,78,18};
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");         //User inputs the size required for an array
		int n=sc.nextInt();
		
		System.out.print("Enter the elements in an array:");
		
		int[] arr1= new int[n];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();                             //taking user input in the array
			}
		sc.close();
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2==0) {
				count++;
				System.out.println(arr1[i]+" "+" is divisible by 2.");
			}
		}
		System.out.println("Total no. divisible by 2 in an array  are: "+ count);
	}

}
