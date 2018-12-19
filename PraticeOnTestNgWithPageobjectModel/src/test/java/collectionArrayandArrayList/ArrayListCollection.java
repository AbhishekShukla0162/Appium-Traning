package collectionArrayandArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("c");
		list.add("C++");
		list.add("java");
		list.add("JavaScript");
		list.add("Appium");
		list.add("Selenium");
		list.add("angular js");
		list.add("HTMl");
		list.add("CSS");
		list.add("Android");

		System.out.println(list);
		list.remove(6);
		System.out.println(list);
		
		


		// Ways to print all element by array list
		/*By Iterator interface.
		By for-each loop.
		By ListIterator interface.
		By for loop.
		By forEach() method.
		By forEachRemaining() method.*/
		
		// 1- By Iterator
		System.out.println();
		System.out.println("Print all element of array list by iterator*******************");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// 2- By for each loop
		System.out.println();
		System.out.println("Print all element of array list by for each loop **************");
		for(String takeAnyObject : list) {
			System.out.println(takeAnyObject);
		}
		
		// 3 - By for loop  
		System.out.println();
		System.out.println("Print all element by for loop  ..********************************");
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//4- By for each method 
		System.out.println();
		System.out.println("Print all element of array list by for each  method ************************");
		/*
	      	list.forEach(a->{ // not Working 
            System.out.println(a);  
          });*/
		
		//5-  By for each remaining method 
		System.out.println();
		System.out.println("Print all element of array list by for each remaining()  method ************************");
		
		/*Iterator<String> itr2 = list.iterator();
		itr2.forEachRemaining(b->{  // Not working 
			System.out.println(b);
		});*/
		
		
		
	}
}
