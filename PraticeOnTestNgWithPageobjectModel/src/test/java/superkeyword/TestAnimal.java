package superkeyword;

class Animal {
	 void eat() {
		System.out.println("Eating bread");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Barking ...");
	}
	void eat() {
		System.out.println("dong eating chapati ");
	}
	
	void work() {
		
		super.eat();
		bark();
		eat();
	}
}
public class TestAnimal {

	public static void main(String[] args) {
		
		
		Dog d = new Dog();
		d.work();
	}
}
