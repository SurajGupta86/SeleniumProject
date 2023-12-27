package ComplexConcepts;

public class UserdefinefExceptionCode {
	static int n=10;
	final int a=10;
	
	public static void main(String[] args) throws Throwable {  //Thorwable handles all the exceptions and errors
		// TODO Auto-generated method stub
		n=99;
	
		System.out.println(n);
		
		int a=10/2;   //it will give the first exception and then terminate if we execute this code (divide by 0)

		Thread.sleep(1000);
		
		throw new Exception("Error Occured");	

	}

}
