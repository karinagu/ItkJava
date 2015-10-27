package Praktikum5;

import Harjutus1.TextIO;

public class LiisuTõmbamine {

	public static int JuhuArv(int min, int max) {

		int Muutujaarv = min + (int) (Math.random() * (max));

		return Muutujaarv;

	}

	public static void main(String[] args) {

		System.out.print("Sisesta arv ");
		int arv = TextIO.getlnInt();
		System.out.print(JuhuArv(1, arv));

	}
}
