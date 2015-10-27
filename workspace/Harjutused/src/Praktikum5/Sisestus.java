package Praktikum5;

import Harjutus1.TextIO;

public class Sisestus {
	public static int kasutajaSisestus(int min, int max) {
		for (int i = 0; i < 3; i++) {

			System.out.format("Sisesta arv vahemikus %d..%d: ", min, max);
			int sisestus = TextIO.getlnInt();
			if (sisestus >= min && sisestus <= max) {
				return sisestus;
			}
			System.out.println("Arv ei ole sobilik");
		}
		throw new IllegalStateException("Kasutaja .....");
	}

	public static void main(String[] args) {
		int arv = kasutajaSisestus(0, 10);
		System.out.println("Sisestasid arvu: " + arv);
	}
}
