package Praktikum8;

import Harjutus1.TextIO;

public class TahtVahetuses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String laul = "Pıdral maja metsa sees, " + "v‰iksest aknast v‰lja vaatab. " + "J‰nes jookseb kıigest, "
				+ "v‰est l‰vel seisma j‰‰b. " + "Kopp-kopp lahti tee," + "metsas kuri jahimees. "
				+ "J‰nes tuppa tule sa, " + "anna k‰ppa ka.";

		System.out.print("Sisesta t‰ht, millega soovid asendada t‰ish‰‰likud");
		char taht = TextIO.getlnChar();

		String taishaalik = "aeioı‰ˆ¸"; // char[] x = new char[]{'a','e'};
		for (char haalik : taishaalik.toCharArray()) {
			laul = laul.replace(haalik, taht);
		}
		System.out.print(laul);
		
		
	}

}
