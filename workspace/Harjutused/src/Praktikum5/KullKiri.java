package Praktikum5;

import Harjutus1.TextIO;

public class KullKiri {

	public static int kasutajaSisestus(String kysimus, int min, int max) {
		for (int i = 0; i < 3; i++) {

			System.out.print(kysimus);
			int sisestus = TextIO.getlnInt();
			if (sisestus >= min && sisestus <= max) {
				return sisestus;
			}
			System.out.println("sisestus ei ole sobilik");
		}
		throw new IllegalStateException("Kasutaja .....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kasutaja = kasutajaSisestus("kull või kiri", 0, 1);
		int arv = SuvalineTaisarv.suvaline(0, 1);
		if (kasutaja == arv) {
			System.out.print("õige");
		} else {
			System.out.print("proovi veel");

		}
	}

}
