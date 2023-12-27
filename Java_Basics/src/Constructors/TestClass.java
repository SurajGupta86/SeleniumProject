package Constructors;

public class TestClass {
	
	//Constructor method having same name as Class name with no return type/
	public TestClass() {
		System.out.println("Constructor method_Parent");
	}
	
	//Constructor method having same name as Class name with no return type
	public TestClass(int i) {
		System.out.println("Hi "+i);
	}
	
	//Concrete method- A normal method/class is called as 'Concrete Method'.
	public void TestClass1(String s) {
		System.out.println("Hi, My name is "+s);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass obj = new TestClass();    // Directly call the constructor method no need to call via obj call
		obj.TestClass1("Elly");
		//obj.TestClass(i);       // No need to call a method for constructor's method.
	} 
	
}
