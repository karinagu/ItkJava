package Kontrolltöö;

public class Katse4Ül2 {

	public static void main(String[] args) {
		System.out.println(negPaaris(2));
		// YOUR TESTS HERE
	}

	public static boolean negPaaris(int n) {
		if (n % 2 == 0 && n < 0) {
			return true;
		}
		// TODO!!! YOUR PROGRAM HERE
		else
			return false;
	}
}
