package collectionArrayandArrayList;

public class MultiplyMatrix {

	public static void main(String[] args) {
		
		int ar[][] = {{1,1,1},{2,2,2},{3,3,3}};
		int ar2[][] = {{1,1,1},{2,2,2},{3,3,3}};
		
		int add [][]= new int [2][3];
		for(int i  = 0; i<2;i++) {
			for(int j  =0; j<3; j++) {
				
				
				add[i][j] = ar[i][j] + ar2[i][j];
				System.out.print(add[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
