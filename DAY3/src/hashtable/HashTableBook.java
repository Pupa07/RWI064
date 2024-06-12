package hashtable;

import java.util.Hashtable;
import java.util.Map;

class Book{
	
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		//super();
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	

}

public class HashTableBook {
	public static void main(String[] args) {
		//Creating map of Books
		Map<Integer,Book> map = new Hashtable<Integer,Book>();
		Book b1 = new Book(101," C","Bipin Rawat","KBT",10);
		Book b2 = new Book(102," Java","Hare Krishna","NareshIT",1000);
		Book b3 = new Book(103," Spring","Srinivasa","AshokIT",500);
		
		//Adding Book To map
		
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		
		//Traversing Map
		
		for(Map.Entry<Integer, Book> entry:map.entrySet()) {
			int key=entry.getKey();
			Book b=entry.getValue();
			System.out.println(key+ " Details");
			System.out.println(b.id+ ""+b.name+"" +b.author+"" +b.publisher);
		}
	}

}
