package IF_ELSE_IF;

import ComplexConcepts.TestCaseCode;  // FOr public access modifies from another project needs to import the package of the class from where it belongs. 

public class TestCaseCode_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TestCaseCode obj=new TestCaseCode();    //Public class can be called in the other package by creating an object for the class.
	//TestCaseCode obj1=new TestCaseCode();
	obj.add(10,15);
	
	//TestCaseCode2 obj1=new TestCaseCode2();  //Default class cannot be called in other package it will throw an errorr
	}
}
