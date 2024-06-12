package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayDec {
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		
		//System.out.println(list1);
		
		Collections.sort(list1);
		
		Collections.reverse(list1);
		
		for(String Letter:list1)
			
			System.out.println(Letter);
		

		
		
	}

}
