package superkeyword;

class  Animall{
	 Animall() {
		System.out.println("Animal is created");
	}
}

class Dogg extends Animall{
	Dogg() {
		System.out.println("Dog is created");
	}
}

public class TestAnimalTwo {

	public static void main(String[] args) {
		Dogg d = new Dogg();
	}

}
