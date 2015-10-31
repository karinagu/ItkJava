package Kontrolltöö;

public class Katse4Ül3 {

	public static void main(String[] args) {
		System.out.println(posElArv(new int[] { 2,-3,4,-5,4}));
		// YOUR TESTS HERE
	}

	public static int posElArv(int[] m) {
		int posEl = 0;
		for (int j : m) {
			if (j > 0) {
				posEl = posEl + 1;
			}
		}

		return posEl; // YOUR PROGRAM HERE
	}

}
