package Praktikum6;



import java.util.ArrayList;
import java.util.List;

import Harjutus1.TextIO;

public class Tühirida {

	public static void main(String[] args) {

		List<String> nimed = new ArrayList<String>();

		String nimi = null;

		do {
			System.out.println("Sisesta nimi");
			nimi = TextIO.getlnString();

			if (!nimi.equals("")) {
				nimed.add(nimi);
			}

		} while (!nimi.equals(""));

		for (int i = 0; i < nimed.size(); i++) {
			nimi = nimed.get(i);
			int asum = 0;
			
			for (int j = 0; j < nimi.length(); j++) {

				if (nimi.toLowerCase().charAt(j) == 'a') {
					asum = asum + 1;
				}
			}
			
			System.out.format("%s ", asum);

			System.out.println(nimi);
		}

	}

}
