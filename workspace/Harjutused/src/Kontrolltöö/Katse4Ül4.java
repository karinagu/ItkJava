package Kontrolltöö;

public class Katse4Ül4 {

	public static void main(String[] args) {
		System.out.println(allaKeskmise(new double[] { 2,5,6 }));
		// YOUR TESTS HERE
	}

	public static int allaKeskmise(double[] d) {
		int vaiksemad = 0;
		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum = d[i] + sum;
		}
		double arKesk = sum / d.length;
		for (double e : d) {
			if (e < arKesk) {
				vaiksemad++;

			}
		}

		return vaiksemad; // YOUR PROGRAM HERE
	}

}
