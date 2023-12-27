package Abs_InterfacesCode;

//To inherit the properties of Interface class we use 'implements' instead of 'extends'
public class InterfaceSubCode implements Int_Code,Int_Code1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Int_Code obj = new IntCode();    //Cannot create object for the interface class
		InterfaceSubCode obj1 = new InterfaceSubCode();
		obj1.close();
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Please open the book");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Read the particular sentence");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Once reading is done, Close the book");	
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
