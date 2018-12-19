package aggression;

public class TestBasic {

	int id;
	String name;
	Besic b;
	public TestBasic(int id,String name,Besic b) {
		this.id = id;
		this.name = name;
		this.b= b;
	}
	void  run() {
		System.out.println(id + " " + name + " "+b.phone+ " " + b.HeadPhone + " " + b.Laptop + " " + b.Bag);
	}
	
	public static void main(String[] args) {
	  
	
		Besic b1 = new Besic("redmi", "Boat","Lemovo", "fasttrack");
		Besic b2 = new Besic("MOto", "Samsung", "Dell","rebok");
		
		TestBasic t1 = new TestBasic(1, "devesh", b1);
		TestBasic t2 = new TestBasic(2, "Shubham", b2);
		
		t1.run();
		t2.run();
		
	

	}

}
