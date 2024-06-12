package linkedlist;

import java.util.LinkedList;

public class LinkedList2 {
	
	public static void main(String[] args) {
		
		
		LinkedList<String> al1 = new LinkedList<String>();
		
		System.out.println("Initial of Elements: "+al1);
		al1.add("Ravi");
		al1.add("Vijay");
		al1.add("Ajay");
		System.out.println("After invoking add(E e) method: "+al1);
		//Adding an Element at the specific position
		
		al1.add(1,"Gourav");
		System.out.println("After invoking addI(int index, E element) method:" +al1);
		
		LinkedList<String> al2 = new LinkedList<String>();
		al2.add("Sonoo");
		al2.add("Hanumat");
		
		al1.addAll(al2);
		System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al2);
		
		LinkedList<String> al3 = new LinkedList<String>();
		al3.add("John");
		al3.add("Rahul");
		
		al2.addAll(1,al3);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al2);
		al2.addFirst("Lokesh");
		System.out.println("After invoking addFirst(E e)"+al2);
		al2.addLast("Harsha");
		System.out.println("After Invoking addLast(E e) method :"+al2);
	}

}
