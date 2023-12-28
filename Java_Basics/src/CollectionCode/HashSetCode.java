package CollectionCode;
import java.util.*;

public class HashSetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();  //Create a set of different data-type
		
		set.add("Ajay");
		set.add(5.25);
		set.add(6);
		set.add("Akash");
		set.add("Atif");
		set.add(5.25);  //No duplicate values accepted
		
		
		System.out.println(set);
		System.out.println(set.size());
		
//		for(int i=0;i<set.size();i++) {   //Cannot use for loop because there is no indexing available for the set
//			Set is an unordered eay of storing data that's the reason indexing not followed
//		}
//		
//		for(Object i:set) {
//			System.out.println(i);
//			
//		}
		
		Iterator<Object> itr = set.iterator();
		while(itr.hasNext()) {
			Object name = itr.next();
			if(name.equals(6)){
				System.out.println("Name found in the set");
			}	
		}
		
//		set.remove("Saritha");
//		System.out.println(set);
		
	

	}

}
