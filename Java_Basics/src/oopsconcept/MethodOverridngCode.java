package oopsconcept;

public class MethodOverridngCode extends MethodOverloadingCode{
	
	@Override
	public void add(int a, int b, int d) { //override means having same method name and same parameter in different class
		int c= a+b+d;
		System.out.println(c);
	}
	
	@Override
	public void add(String c, int d) {
		String f= c+" "+(5+d);
		System.out.println(f);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingCode obj =  new MethodOverridngCode();
		obj.add(5,6,7+1);
		obj.add("Hello", 5);
		

	}

}
