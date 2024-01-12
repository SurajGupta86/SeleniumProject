package CollectionCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map(key value pair) is an unordered way of storing data in the map
		Map<Integer,String> map = new HashMap();
		map.put(1, "Suraj");  //we use put for adding the values in map
		map.put(2, "10");
		map.put(3, "Java");
		map.put(4, "80");
		map.put(5, "Surya");
		map.put(3, "Java1");  //Updates the value in the map with the latest one if there are similar values to a particular key
		map.put(2, "10");     //No duplicates allowed
		
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get(2)); //will print the last updated value
		
	//	Set<Integer> keys = map.keySet();
		
		for(Integer key : map.keySet()) {
			System.out.println(key+"="+map.get(key));
			
		}
		
		Map<String, List<String>> usernames = new HashMap<>();
		
		List<String> listofusers = new ArrayList<String>();
		listofusers.add("Himani");
		listofusers.add("Suraj");
		listofusers.add("Saritha");
		listofusers.add("Neetha");
		listofusers.add("Bharti");
		
		usernames.put("a", listofusers);
		System.out.println(usernames.get("a"));
		
		System.out.println(usernames);
		

	}

}