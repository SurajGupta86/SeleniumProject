package Loops;

public class DowhileCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int i=1;
			System.out.println("The numbers from 1 to 100 which are divisible by 5 are: ");
				
			do {                    
					
				if(i%5==0) {				   // check if i is divisible by 5.
						
					System.out.println(i);     //print all the numbers which are divisible by 5
				}
					i++;					   //increment i by 1 
			}
			while(i<=100);                     // i will check the condition from 1 to 100.

		}

}
