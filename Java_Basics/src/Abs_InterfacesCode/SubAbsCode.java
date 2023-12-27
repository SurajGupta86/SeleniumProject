package Abs_InterfacesCode;

public class SubAbsCode extends Abs_Code implements Int_Code{
	
	public static void add() {       //static method
		System.out.println("Hello");
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abs_Code obj = new Abs_Code();
		obj.update("Howrah");
		SubAbsCode.add();		//static method can be called directly without creating an object
	}

}
