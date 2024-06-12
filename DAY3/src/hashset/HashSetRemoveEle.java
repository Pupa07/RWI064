package hashset;

import java.util.HashSet;

public class HashSetRemoveEle {
	
	public static void main(String[] args) {
		
		
		HashSet<String> set=new HashSet<String>();
		
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");
		
		System.out.println("An initial list of element:"+set);
		
		//Removing specific element from HashSet
		set.remove("Ravi");
		
		System.out.println("After Invoking reemove method:"+set);
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		set.addAll(set1);
		System.out.println("Upadate List:"+set);
		
		//removing all the new element from Hashset
		
		set.removeAll(set1);
		System.out.println("After invoking removeALL method:"+set);
		
		set.removeIf(str->str.contains("Vijay"));
		System.out.println("After invoking removeif() method:"+set);
		
		//removing all the elements vialable in the set
		
		set.clear();
		System.out.println("After Invoking Clear() Method:"+set);
		
	}

}
