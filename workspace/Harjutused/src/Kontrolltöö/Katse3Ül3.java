package Kontrolltöö;

public class Katse3Ül3 {

	public static void main(String[] args) {
		System.out.println(ruutudeSumma(new int[] { 2,3,3 }));
		// YOUR TESTS HERE
	}

	public static int ruutudeSumma(int[] m) {
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			int ruudus = m[i] * m[i];
			sum = ruudus + sum;
		}

		return sum; // YOUR PROGRAM HERE
	}

}
