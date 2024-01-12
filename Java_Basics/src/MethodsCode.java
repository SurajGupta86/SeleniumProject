public class MethodsCode {
	int m=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsCode obj = new MethodsCode();
		obj.Add1(5, 6, 8);
		
	}
	//int m1=6;
	public void Add(int a, int b) {
		int sum=a+b;
		System.out.println("Sum of 2 no.s are "+ sum);
	}
	public void Add1(int a, int b, int c) {
		MethodsCode obj = new MethodsCode();
		obj.Add(3, 4);
		int sum=a+b+c;
		System.out.println("Sum of 3 no.s are "+ sum+" ");
		System.out.println(m);
	}
	
}
