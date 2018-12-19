package gmailautomation;

import java.util.HashMap;

import java.util.Map;

public class HashMapCollection {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "JAvaScript");
		hm.put(2, "HTML");
		hm.put(3, "CSS");
		hm.put(4, "Angular JS");
		hm.put(5, "JAVA");
		hm.put(6, "Selenium");

		System.out.println(hm.get(2));

		System.out.println(hm.get(5));

		System.out.println(hm.get(8));

		for (Map.Entry m : hm.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());

		}

		hm.remove(4);
		System.out.println(hm);

	}

}
