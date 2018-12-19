package aboutEnum;

enum mobilePhone {
	Nokia, Apple(100), Samsung(400), Mi(-1), mi(-1);

	int price;
	int Oppoprice;
	int Oppoprice2;

	mobilePhone() {

	}

	mobilePhone(int price) {
		this.price = price;
	}
	

}

public class Mobile {

	public static void main(String[] args) {

		System.out.println(mobilePhone.Apple);
		System.out.println(mobilePhone.Apple + " " + mobilePhone.Apple.price);
		System.out.println(mobilePhone.Nokia);

		for (mobilePhone m : mobilePhone.values()) {
			System.out.println(m + "  " + m.price);

		}

	}

}
