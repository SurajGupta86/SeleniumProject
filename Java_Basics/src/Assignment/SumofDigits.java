package Assignment;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class SumofDigits
{
 public static void main(String [] args)
  {
   Scanner sc=new Scanner(System.in);
   int sum=0;
   try
    {
      System.out.print("Input Number:");
      int n=sc.nextInt();
      int a=n;   //store the value of given number in a variable
      while(n>0) {  //Condition check
    	  sum=sum+(n%10);  //Adding the remainder values of sum
    	  n=n/10;
      }
      System.out.println("The sum of the number "+" is: "+sum); 
    }
   
   catch(Exception e)
    {
      System.out.print("Error:: Enter Only Numeric Value");
    }
  }
}

