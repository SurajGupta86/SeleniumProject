package CollectionCode;

import java.util.ArrayList;
//import java.util.List;

public class ArrayListIntCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lt = new ArrayList<Integer>();  //ArrayList of specific datatypes ie-intger
		
		lt.add(10);
		lt.add(20);
		lt.add(30);
		lt.add(null);  //null value can be considered as a integer value
		lt.add(30);    //duplicate values allowed
		
		lt.remove(1);
		lt.add(1, 40);
		
		for(Integer i:lt) {   //Print the values one by one in a line
			System.out.println(i);
		}
		
		int i = lt.get(0);  //No need to type case because the variable is int and also the ArrayList of type int
		System.out.println(lt.subList(1, 4));  //Returns a particular range of value from the ArrayList
		System.out.println(lt);  //Prints the entire list
	}

}