package Praktikum5;

public class TäringuMäng {
	public static int Veereta() {
		int arv = 1 + (int) (Math.random() * (6));

		return arv;
	}

	// public static int VeeretaSumma() {
	// int sum = Veereta() + Veereta();
	// return sum;
	// }
	public static int VeeretaSumma(int i) {
		int sum = 0;
		for (int j = 0; j < i; j++) {
			sum = sum + Veereta();
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Mängija = VeeretaSumma(2); //esimese verisiooni puhul  int Mängija = VeeretaSumma();
		int Arvuti = VeeretaSumma(2);
		System.out.println("Mängija summa " + Mängija);
		System.out.println("Arvuti summa " + Arvuti);
		System.out.println("Võitja on " + (Arvuti > Mängija ? "Arvuti" : "Mängija")); // if
																						// else
																						// conditional
	}

}
