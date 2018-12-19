package aggression;

public class EmployeeextendsAddress {

	int id;
	String name;
	Address ads;
	
	EmployeeextendsAddress(int id, String name , Address ads){
		this.id = id;
		this.name = name;
		this.ads = ads;
	}
	
	void display() {
		System.out.println(id + " " + name);
		System.out.println(ads.country + " " + ads.state + " " + ads.city);
	}
	public static void main(String[] args) {
		Address a1 = new Address("India","up","Allahaad");
		Address a2 = new Address("US","verginia","Sanfrancisco");

		EmployeeextendsAddress e1 = new EmployeeextendsAddress(1, "Abhishek", a1);
		EmployeeextendsAddress e2 = new EmployeeextendsAddress(2, "MAx", a2);
		
		e1.display();
		e2.display();
		
		

	}

}
