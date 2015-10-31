package Praktikum8;

import java.util.ArrayList;
import java.util.List;

import javax.xml.soap.Text;

import Harjutus1.TextIO;

public class Kassa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char k�sk;
		
		do {
			System.out.println("Uus kliet");
			Kassa();
			System.out.println("J�rgmine klient? (J/E)");
			k�sk = TextIO.getlnChar();
		} while (k�sk == 'j');
		  
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

		for (Integer kup��r : tagasiSumma) {
			System.out.println(kup��r);
		}
	}

	public static List<Integer> AnnaTagasi(int vahe) {
		int[] kup��rid = new int[] { 500, 100, 50, 20, 10, 5, 2, 1 };
		List<Integer> tagasiKup��rid = new ArrayList<Integer>();

		int kup��rIndex = 0;

		while (vahe > 0) {
			int kup��r = kup��rid[kup��rIndex];

			if (kup��r <= vahe) {
				vahe = vahe - kup��r;
				tagasiKup��rid.add(kup��r);
			} else {
				kup��rIndex++;
			}
		}

		return tagasiKup��rid;
	}
}
