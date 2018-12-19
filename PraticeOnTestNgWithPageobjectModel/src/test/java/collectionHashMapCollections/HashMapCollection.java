package collectionHashMapCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Html");
		hm.put(2, "CSS");
		hm.put(3, "JavaScript");
		hm.put(4, "JAva");
		hm.put(5, "Appium");

		System.out.println(hm.get(4));
		System.out.println(hm.get(2));

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}

		HashMap<Integer, Employee> hmm = new HashMap<Integer, Employee>();

		Employee e1 = new Employee(1, "Abhishek", 100);
		Employee e2 = new Employee(2, "Shubham", 200);
		Employee e3 = new Employee(3, "Devssh", 3000);
		hmm.put(7, e1);
		hmm.put(8, e2);
		hmm.put(9, e3);

		for (Map.Entry mm : hmm.entrySet()) {
			System.out.println(mm.getKey() + "  " + mm.getValue());
		}

	}
}
