package Abs_InterfacesCode;

public abstract class AbstractionCode {    //Created a abstraction class
	public abstract void open();           //Abstraction method without body
	public abstract void read();
	public abstract void close();
	
	public void update(String s) {        //Concrete method
		System.out.println("Please update "+s+" in a page of the book");
	}
	
}
