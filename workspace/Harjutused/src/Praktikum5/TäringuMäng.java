package Praktikum5;

public class T�ringuM�ng {
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
		int M�ngija = VeeretaSumma(2); //esimese verisiooni puhul  int M�ngija = VeeretaSumma();
		int Arvuti = VeeretaSumma(2);
		System.out.println("M�ngija summa " + M�ngija);
		System.out.println("Arvuti summa " + Arvuti);
		System.out.println("V�itja on " + (Arvuti > M�ngija ? "Arvuti" : "M�ngija")); // if
																						// else
																						// conditional
	}

}
