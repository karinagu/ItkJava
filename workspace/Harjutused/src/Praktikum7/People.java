package Praktikum7;

import java.util.ArrayList;

import Harjutus1.TextIO;

public class People {

	public static void main(String[] args) {
		ArrayList<String> nimed = new ArrayList<String>();
		String nimi = null;
		do {
			System.out.print("Sisesta nimi");
			nimi = TextIO.getlnString();

			if (!nimi.equals("")) {
				nimed.add(nimi);
			}

		} while (!nimi.equals(""));
		
		Human [] people =new Human[nimed.size()];
		int vanus = 0;
		for (int i = 0; i < nimed.size(); i++) {
			System.out.print("Sisesta "+nimed.get(i)+" vanus");
			vanus = TextIO.getlnInt();
			people[i] =new Human(nimed.get(i), vanus);
			
		}
		for (int i = 0; i < people.length; i++) {
			people[i].greet(); 
			
		}
	}

}
