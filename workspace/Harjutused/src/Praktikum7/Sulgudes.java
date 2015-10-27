package Praktikum7;

import Harjutus1.TextIO;

public class Sulgudes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Kirjuta lause");
		String[] lause = null;
		lause = TextIO.getlnString().split(" ");
		for (int i = 0; i < lause.length; i++) {
			System.out.format(" (%s) ", lause[i]); //system.out.print(" ( " +lause[i]+ " ) ")
		}
		//Või nii
		//String lause = TextIO.getlnString().replace(" ", ") (");
		//System.out.format("(%s)", lause);

	}
}
