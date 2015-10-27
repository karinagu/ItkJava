package Praktikum8;

import Harjutus1.TextIO;

public class TagurpidiSõna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Write a word");
		String word = TextIO.getlnString().toLowerCase();

		boolean ispalindrom = true;
		int max = word.length() - 1;

		for (int i = 0; i < max/2; i++) {
			if (word.charAt(i) != word.charAt(max - i)) {
				ispalindrom = false;
				break;
			}
		}

		if (ispalindrom == true) {
			System.out.print("Is palindrom");
		} else {
			System.out.print("Is not palidrom");
		}
	}

	/**********************************************************/

	public void Version2() {

		System.out.print("Write a word");
		String word = TextIO.getlnString().toLowerCase();

		if (IsPalindrome(word)) {
			System.out.print("Is palindrom");
		} else {
			System.out.print("Is not palidrom");
		}

	}

	public static boolean IsPalindrome(String word) {

		int max = word.length() - 1;

		for (int i = 0; i < Math.ceil(max / 2); i++) {
			if (word.charAt(i) != word.charAt(max - i)) {
				return false;
			}
		}

		return true;
	}
}
