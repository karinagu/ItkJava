package Kontrolltöö;

public class Answer {

	public static void main(String[] args) {
		System.out.println(posSumma(new int[] { 0, -1, 3, 2, -8 }));
		// YOUR TESTS HERE
	}

	public static int posSumma(int[] m) {
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] > 0) {
				sum = m[i] + sum;
			}
		}

		return sum; // YOUR PROGRAM HERE

	}
	
	public static int posSummaX(int[] m) {
		int sum = 0;
		for (int element : m) {
			if (element > 0) {
				sum = element + sum;
			}
		}

		return sum; // YOUR PROGRAM HERE

	}
}
