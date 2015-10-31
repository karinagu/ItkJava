package Kontrolltöö;

public class Katse3Ül4 {

	public static void main(String[] args) {
		System.out.println(keskmisestParemaid(new double[] { 2,4,5 }));
		// YOUR TESTS HERE
	}

	public static int keskmisestParemaid(double[] d) {
		int suuremad = 0;
		double sum = 0;
		double arKesk = 0;
		for (int i = 0; i < d.length; i++) {
			sum = d[i] + sum;
		}
		arKesk = sum / d.length;
		for (double e : d) {
			if (e > arKesk) {
				suuremad++;
			}
		}

		return suuremad; // YOUR PROGRAM HERE
	}

}
