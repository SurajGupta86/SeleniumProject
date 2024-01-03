package oopsconcept;

//import java.util.Scanner;

public class BaseClass {
	public int AccNumber=1234;
	private int PinNo=2468;
	private long balanceamount=20000;	
	
	public static void main(String[] args) {
		 
//		Scanner sc = new Scanner(System.in);
//		int m=sc.nextInt();  // Take a user input for Account no.
//		int n=sc.nextInt();  // Take a user input for Pin No.
//		BaseClass obj=new BaseClass(); //Create an object from the BaseClass.
//		
//		System.out.println("Enter the Account No: ");
//		obj.setAccNumber(m);             //Calling a method to give the input as a Account No.
//		int a=(obj.getAccNumber());		 //Calling a method to print the entered Account No. 
//		System.out.println("Please show the Account Number: "+a);
//
//		System.out.println("Enter the Pin No: ");
//		obj.setPinNo(n);                //Calling a method to give the input as a Pin No.
//		int b=(obj.getPinNo());			//Calling a method to print the entered Pin No.
//		System.out.println("Please show the Pin number: "+b);
	}
	
	public void Login(int accno,int pinno){
		if(accno==AccNumber && pinno==PinNo) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Invalid Credentials during Login");
		}
	}
	public void Withdraw(int accno,int pinno,long amount){
		BaseClass obj=new BaseClass();
		obj.Login(accno, pinno);
		if(accno==AccNumber && pinno==PinNo) {
			if(amount<balanceamount) {
				
					if(amount<=(balanceamount-5000)) {
				
						System.out.println("Starting the withdrawal process");
						balanceamount=(balanceamount-amount);
						System.out.println("Withdrawal process completed, Enjoy with your money");
						System.out.println("Balance Left: "+balanceamount);
					}
					else {
						System.out.println("The current bank balance amount is "+balanceamount+"."+"Please maintain atleast 'Rs.5000' in account and then withdraw money without any extra charge");			
					}
			}
			else {
				System.out.println("Withdrawal amount is greater than the balance amount");
			}
		}
//		else {
//			System.out.println("Invalid Credentials during Withdrawal process");
//		}
	}
	
//	public int getAccNumber() {
//		return AccNumber;
//	}
//	public int getPinNo() {
//		return PinNo;
//	}
//	public long getBalanceamount() {
//		return balanceamount;
//	}
//	public void setAccNumber(int accNumber) {
//		AccNumber = accNumber;
//	}
//	public void setPinNo(int pinNo) {
//		PinNo = pinNo;
//	}

}
