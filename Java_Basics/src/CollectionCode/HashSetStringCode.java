package CollectionCode;
import java.util.*;

	public class HashSetStringCode {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			HashSet<String> set=new HashSet<String>();  //Create a set of integer data-type
			//HashSet<String> set=new HashSet();
			
			set.add("Ajay");
			set.add("Suraj");
			set.add("Akash");
			set.add("Atif");
			set.add("Suraj");  //No duplicate values accepted
			
			
			System.out.println(set);
			System.out.println(set.size());
			
//			for(int i=0;i<set.size();i++) {   //Cannot use for loop because there is no indexing available for the set
//				Set is an unordered eay of storing data that's the reason indexing not followed
//			}
//			
//			for(String i:set) {
//				System.out.println(i);
//				
//			}
//			
			Iterator<String> itr = set.iterator();
			while(itr.hasNext()) {    //returns true if the iteration has more elements
				String name = itr.next(); //returns the  next element in the iteration
				System.out.println(name);
//				if(name.equals("Suraj")){
//					System.out.println("Name found in the set");
//				}	
			}
			
//			set.remove("Akash");
//			System.out.println(set);
			

	}

}
