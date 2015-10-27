package Kontrolltöö;

public class MassiivVaiksemArK {

	public static void main(String[] args) {
		System.out.println(allaKeskmise(new double[] { 2,4,5 }));
		// YOUR TESTS HERE
	}

	public static int allaKeskmise(double[] d) {

		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum = d[i] + sum;
		}
		double arKesk = sum / d.length;
		int vaiksem = 0;
		for (double e : d) {
			if (e < arKesk) {
				vaiksem++;// vaiksem=vaiksem+1
			}
		}

		return vaiksem; // YOUR PROGRAM HERE
	}

}
