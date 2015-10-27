package Praktikum6;

import Harjutus1.TextIO;

public class LiisuHeitmine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Sisesta osalejate arv ");
		int kasutajad = TextIO.getlnInt();
		
		String[] nimed = new String[kasutajad];
		
		for (int i = 0; i < nimed.length; i++) {
			System.out.print("Sisesta nimi");
			nimed[i] = TextIO.getlnString();	
		}
		
		int arv = 1 + (int) (Math.random() * (nimed.length));
		System.out.print("Võitja on "+ nimed[arv]);
	}
}