package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapNDuplicateK {
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(1, "Mango");//put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(1, "Grapes");//trying Duplicate key
		
		System.out.println("Iterating Hashmap....");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
	}

}
