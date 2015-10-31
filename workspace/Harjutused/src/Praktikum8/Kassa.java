package Praktikum8;

import java.util.ArrayList;
import java.util.List;

import javax.xml.soap.Text;

import Harjutus1.TextIO;

public class Kassa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char käsk;
		
		do {
			System.out.println("Uus kliet");
			Kassa();
			System.out.println("Järgmine klient? (J/E)");
			käsk = TextIO.getlnChar();
		} while (käsk == 'j');
		  
		System.out.println("Head aega");
	}

	public static void Kassa() {
		System.out.println("Arve:");
		int arve = TextIO.getlnInt();
		System.out.println("Maksti:");
		int anti = TextIO.getInt();
		int vahe = anti - arve;
		System.out.println("Anna tagasi: " + vahe);

		List<Integer> tagasiSumma = AnnaTagasi(vahe);

		for (Integer kupüür : tagasiSumma) {
			System.out.println(kupüür);
		}
	}

	public static List<Integer> AnnaTagasi(int vahe) {
		int[] kupüürid = new int[] { 500, 100, 50, 20, 10, 5, 2, 1 };
		List<Integer> tagasiKupüürid = new ArrayList<Integer>();

		int kupüürIndex = 0;

		while (vahe > 0) {
			int kupüür = kupüürid[kupüürIndex];

			if (kupüür <= vahe) {
				vahe = vahe - kupüür;
				tagasiKupüürid.add(kupüür);
			} else {
				kupüürIndex++;
			}
		}

		return tagasiKupüürid;
	}
}
