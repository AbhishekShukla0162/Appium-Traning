package gmailautomation;

public class Admin {
	public static void main(String args[]) {
		Add a1 = new Add();
		System.out.println(a1.addition(10, 20));

		Substraction s1 = new Substraction();
		System.out.println(s1.substraction(100, 50));

		Multiplication m1 = new Multiplication();
		System.out.println(m1.multiply(10, 5));

		Divide d1 = new Divide();
		System.out.println(d1.divide(20, 5));
	}

}
