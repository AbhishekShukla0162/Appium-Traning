package collectionArrayandArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Shubham", 778534624);
		Student s2 = new Student(2, "devesh", 6342745);
		
		Student s3 =new Student(3, "Sobhit", 735346);
		
		ArrayList<Student> ll = new ArrayList<Student>();
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		
		Iterator itr2 = ll.iterator();
		
		for(Student ss : ll) {
			
			System.out.println(ss.id + " " + ss.name + " " + ss.contact);
					
		}
		
		
		
	}

}
