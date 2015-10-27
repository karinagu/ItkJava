package Praktikum4;

public class Diagonaal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 0; row < 7; row++) {
			for (int col = 0; col < 7; col++) {
				
				if(row==col){
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}	
			}
			System.out.println();
		}
	}

}
