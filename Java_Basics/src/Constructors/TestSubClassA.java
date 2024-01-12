package Constructors;

public class TestSubClassA extends TestClass{
	
	public TestSubClassA(){
		//super();                         //For calling a constructor method we use 'Super' keyword ie-> super.methodname();
		System.out.println("Constructor method_A");
	}

	
	@Override
	public void TestClass1(String s) {
		super.TestClass1(s);               //For calling a concrete method we use 'Super' keyword ie-> super.methodname();
		System.out.println("Hello, My name is "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestSubClassA obj = new TestSubClassA();
	    obj.TestClass1("Alexa");
	}

}
