package Constructors;

public class TestSubClassA extends TestClass{
	
	public TestSubClassA(){
		//super();                         //For calling a constructor method we use 'Super' keyword ie-> super.methodname();
		System.out.println("Constructor method_A");
	}

	
	@Override
	public void TestClass1(String k) {
		super.TestClass1(k);               //For calling a concrete method we use 'Super' keyword ie-> super.methodname();
		System.out.println("Hello, My name is "+k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestSubClassA obj = new TestSubClassA();
	    obj.TestClass1("Alexa");
	}

}
