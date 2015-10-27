package Praktikum6;

import Harjutus1.TextIO;

public class KümmeArvuVastupidi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arvud = new int[10];
		for (int i = 0; i < arvud.length; i++) {
			System.out.print("Sisesta 10 arvu ");
			arvud[i] = TextIO.getlnInt();
		}
		for (int i = arvud.length; i > 0; i--) {
			System.out.println(arvud[i-1]);
			
		}
	}

}
