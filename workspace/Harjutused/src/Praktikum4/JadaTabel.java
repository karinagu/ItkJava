package Praktikum4;

public class JadaTabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				/*if (row+col > 9){
					System.out.print(row + col - 10 + " ");
				}
				else {
					System.out.print(row+col+ " ");
				}*/
				
				System.out.print((row+col)%10 +" ");
			}
			System.out.println();
			
		}
	}

}
