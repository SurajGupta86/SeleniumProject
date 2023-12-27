package Constructors;

//import ComplexConcepts.TestCaseCode;   //Incase of using a class file from other package we need to import it before using for public

public class TestSubClassB extends TestSubClassA{

	public TestSubClassB(){
		super();                         //For calling a constructor method we use 'Super' keyword ie-> super.methodname();
		System.out.println("Constructor method_B");
	}
	
	@Override
	public void TestClass1(String s) {
		//super.TestClass1(s);               //For calling a concrete method we use 'Super' keyword ie-> super.methodname();
		System.out.println("Hello "+s+", how are you");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    TestClass obj = new TestSubClassB();
	    obj.TestClass1("Alexa");

	}

}
