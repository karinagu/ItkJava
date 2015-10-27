package Kontrolltöö;

public class Katse2Ül4 {

	public static void main(String[] args) {
		System.out.println(keskmisestParemaid(new double[] { 3, 2, 4, 4 }));
		// YOUR TESTS HERE
	}

	public static int keskmisestParemaid(double[] d) {
		int suuremad = 0;
		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum = d[i] + sum;
		}
		double arKeskmine = sum / d.length;
		for (double e : d) {
			if (e > arKeskmine) {
				suuremad++;
			}
		}

		return suuremad; // YOUR PROGRAM HERE
	}

}
