package Raamatu�l;

import Harjutus1.TextIO;

public class K�siNime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Mis on sinu nimi?");
		String nimi = TextIO.getlnString();
		nimi = nimi.toUpperCase();
		System.out.printf("Tere, %s, meeldiv tutvuda", nimi);

	}

}
