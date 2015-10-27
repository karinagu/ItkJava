package Praktikum6;

public class ElementideSumma {
	public static int summa(int[] massiiv) {
		// meetodi sisu siia
		int arvutus = 0;
		for (int i = 0; i < massiiv.length; i++) {
			arvutus = arvutus + massiiv[i]; // arvutus+=massiiv[i] teine variant
		}
		return arvutus;
	}

	public static void main(String[] args) {
		// sedasi saab meetodi välja kutsuda
		int[] numbrid = new int[] { 4, 3, 1, 7, -1 };
		int summa = summa(numbrid);
		System.out.println(summa);

	}

}
