package Praktikum5;

public class Jada {
	public static String jada(char taht, int mitu) {
		String tahed = "";

		for (int i = 0; i < mitu; i++) {
			tahed = tahed + taht;
		}
		return tahed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mitu = 3;
		System.out.println(jada('b', mitu)); // "bbb"
		System.out.println(jada('-', 10)); // "----------"

		// joonistame kuuske
		for (int i = 0; i < 10; i++) {
			System.out.format("%10s%s\n", jada('/', i), jada('\\', i));
		}
		// kuuse jalg
		for (int i = 0; i < 3; i++) {
			System.out.format("%13s\n", jada('|', 6));
		}

	}
}
