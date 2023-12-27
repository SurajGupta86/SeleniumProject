package oopsconcept;

public class MethodOverloadingCode {
	
	public int add(int a, int b) {
		int c= a+b;
		return c;
	}
	
/*	public void add(int a_a, int b_b) {  
	
	//Method overloading allows to have same method name with different types or different parameters being passed	
	
	}
*/	
	public void add(int m, int n, int o) {
		System.out.println("Addition of 3 no.s");
		System.out.println(m+n+o);
		
	}
	
	public void add(String c, int d) {
		String f= c+d;
		System.out.println(f);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingCode obj = new MethodOverloadingCode();
		//MethodOverloadingCode obj1 = new MethodOverloadingCode();
		
		obj.add(7+5,3,5);
		obj.add("Hii", 5);
		System.out.println(obj.add(6,5));

	}

}
