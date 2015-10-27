package Praktikum4;

import Harjutus1.TextIO;

public class RistRaamis {

	public static void main(String[] args) {
		
		int total= TextIO.getInt();
		
		for (int i = 0; i < total*2+3; i++) {
			System.out.print("-");
		}
			
		System.out.println();
		
		for (int row = 0; row < total; row++) {
			System.out.print("| ");						
			for (int col = 0; col < total; col++) {
							
				if(row==col || row+col==total-1){
					System.out.print("X ");
				}
				else {
					System.out.print("0 ");
				}	
				
			}
			System.out.println("| ");
			
		}
		for (int i = 0; i < total*2+3; i++) {
			System.out.print("-");
		}

	}

}


