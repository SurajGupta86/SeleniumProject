package CollectionCode;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistCode{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		
//		System.out.println(list.size());
//		System.out.println(list);
		
		//add in arraylist
		list.add(10);
		list.add("Himani");
		list.add(10.45);
		list.add('c');
		list.add(true);
		list.add(null);
		
//		System.out.println(list);
//		System.out.println(list.size());
		
//		how to fetch values
//		System.out.println(list.get(0));
//		System.out.println(list.get(5));
		
		//Remove
		
//		list.remove(2);
//
//		System.out.println(list);
//		System.out.println(list.size());
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
//		for(Object i:list) {
//			System.out.println(i);
//		}
//		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		int var = (Integer) list.get(0);  //Type casting the 'object' datatype to integer
		System.out.println(20+var);
		
		
		
	
	}

}