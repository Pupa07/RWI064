package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("Jai");
		//list.add(32); // Compile time error
		
		String s = list.get(1);//Type casting is not required
		System.out.println("Element is: "+s);
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
