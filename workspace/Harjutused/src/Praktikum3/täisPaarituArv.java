package Praktikum3;

import Harjutus1.TextIO;

public class täisPaarituArv {
	public static void main(String[] args) {
		
		System.out.print("Sisesta täisarv ");
		int input = TextIO.getlnInt();
		
		
		if (input % 2 == 1) {
			System.out.print("paaritu arv");
		}
		else {
			System.out.print("paaris arv");
		}
		
		
	}}



