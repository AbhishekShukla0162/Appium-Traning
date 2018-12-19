package collectionlinkedList;

import java.util.LinkedList;

public class Simple {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Abhishek");
		ll.add("Shukla");
		ll.add("enwidth");
		
		System.out.println("Element of Linked List = " + ll);
		ll.remove(1);
		System.out.println("Element of Linked List = " + ll);
		ll.add("8565009444");
		System.out.println("Element of Linked List = " + ll);
		ll.remove("enwidth");
		System.out.println("Element of Linked List = " + ll);	
		
		ll.add(1, "Technology");
		System.out.println("Element of linked list = " + ll);
		
		ll.add(0, "Information");
		System.out.println("Element of linked list = " + ll);
		
	}
}
