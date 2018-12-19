package collectionlinkedList;

import java.util.LinkedList;

public class TestBook {

	public static void main(String[] args) {
		
		LinkedList<Book> ll1= new LinkedList<Book>();
		
		Book b1 = new Book(1, "c", "Computer Science", "CSE", 780);
		Book b2 = new Book(2, "c++", "Computer Science", "CSE", 180);
		Book b3 = new Book(3, "Java", "Computer Science", "CSE", 80);
		Book b4 = new Book(4, "MachineLearing", "Mechanical", "ME", 580);
		Book b5 = new Book(5, "Engineering MathMatics", "Math1", "All", 250);
		
		ll1.add(b1);
		ll1.add(b2);
		ll1.add(b3);
		ll1.add(b4);
		ll1.add(b4);
		ll1.add(b5);
		
		for(Book b : ll1) {
			System.out.println(b.id + " " + b.bookName + " " + b.subject + " " + b.branch + " " +  b.price);
		}
		

	}

}
