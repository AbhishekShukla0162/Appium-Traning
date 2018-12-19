package polymorphism;

class TestBank {
	public static void main(String args[]) {

		int a = 1;
		int b = a + 2;
		System.out.println(a + " + 2 = " + b);
		int c = b - 1;
		System.out.println(b + " - 1 = " + c);
		int d = c * 10;
		System.out.println(c + " * 10 = " + d);
		int e = d / 5;
		System.out.println(d + " / 5 = " + e);
		int f = e % 3;
		System.out.println(e + " % 3 = " + f);
		System.out.println(f + " + 2 = " + b);

	}
}
