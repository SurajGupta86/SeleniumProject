import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row of 2D array:");         //User inputs the rows size required for an array
		int a=sc.nextInt();
		
		System.out.println("Enter the column of 2D array:");         //User inputs the columns size required for an array
		int b=sc.nextInt();
		
		//System.out.print("Enter the elements in an array:");
		
		int[][] arr= new int[a][b];
		
		for(int i=0;i<arr.length;i++) {                              //outer loop iterates for the rows 
			for(int j=0;j<arr[i].length;j++) {						 //inner loop iterates for the columns
				System.out.println("Enter the element at the location: " +i+","+j);	
				arr[i][j]=sc.nextInt();                             //taking user input in the array
			}
		}
		sc.close();
		
		for(int i=0;i<arr.length;i++) {                              //outer loop iterates for the rows 
			for(int j=0;j<arr[i].length;j++) {						 //inner loop iterates for the columns
				if(arr[i][j]%5==0) {
					count++;
				}                             
			}
		}
		
		System.out.println(count+"numbers are divisible");	
	}

}
