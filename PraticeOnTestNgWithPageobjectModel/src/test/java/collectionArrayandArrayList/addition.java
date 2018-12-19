package collectionArrayandArrayList;

public class addition {

	public static void main(String[] args) {

		int arr1[][] = { { 2, 4, 6 }, { 2, 4, 6 } };

		int arr2[][] = { { 2, 4, 6 }, { 2, 4, 6 } };

		int add[][] = new int[2][3];
       
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 3; j++) {

				add[i][j] = arr1[i][j] + arr2[i][j];

				System.out.print(add[i][j] + " ");
			}

			System.out.println();
		}

	}

}
