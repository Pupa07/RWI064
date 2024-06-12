package hashtable;

import java.util.Hashtable;

public class HashTable {
	
	public static void main(String[] args) {
		
		Hashtable<Integer,String> map =new Hashtable<Integer,String>();
		
		map.put(100,"Amit");
		map.put(102,"Ravi");
		map.put(103,"Vijay");
		map.put(104,"Rahul");
		
		System.out.println("Before Remove:"+map);
		
		//Remove Value for key 102
		map.remove(102);
		System.out.println("After Remove:"+map);
	}

}
