package Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class UpdateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr= new ArrayList<String>();
		
		arr.add("Yellow");
		arr.add("Blue");
		arr.add("Green");
		arr.add("Red");
		arr.add("Purple");
		
		System.out.println(arr.size());
		System.out.println(arr);
		
		//Print the list using for loop
		System.out.println("the list using for loop: ");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		//Print the list using advance for loop
		System.out.println("the list using advance for loop: ");
		for(String str: arr) {
			System.out.println(str);
		}	
		//Print the list using iterator
			System.out.println("the list using iterator: ");	
		Iterator<String> itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//arr.remove(4);  //removing the last element
		int index=arr.indexOf("Purple");
		arr.set(index, "Black");  //updating the value by giving the location and value to be replaced without deleting the value
		System.out.println(arr.size());
		System.out.println(arr);

	}
}
