package collectionQueue;

import java.util.PriorityQueue;

public class First {

	public static void main(String[] args) {
		
		PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("Abhishek");
		
		p.add("decegsh");
		
		p.add("Shubham");
		
		p.add("Swapmil");
		
		System.out.println(p.element());
		
		System.out.println(p.peek());

		p.add("New");
		
		System.out.println(p);
		
	}

}
