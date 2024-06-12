package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetE2 {
	
	public static void main(String[] args) {
		//Creating Hashset and Adding Elements
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");//Duplicates Are not Allowed.
		set.add("Ajay");
		
		//Traversing Elements
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
