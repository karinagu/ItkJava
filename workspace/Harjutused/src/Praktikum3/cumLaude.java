package Praktikum3;

import Harjutus1.TextIO;

public class cumLaude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double input1;
		do {
			System.out.println("Sisesta kaalutud keskhinne ");
			input1 = TextIO.getlnDouble();
		} while (input1 <= 0);

		int input2;
		do {
			System.out.println("Sisesta l�put�� hinne ");
			input2 = (int) TextIO.getlnInt();
			if (input2<=0) 
				System.out.println("L�put�� hinne ei tohi olla negatiivne ");
			
		} while (input2 <= 0);

		if (input1 > 4.5 && input2 == 5) {

			System.out.print("Jah saad cum laude diplomile!");
		} else {
			System.out.print("Ei saa!");
		}

	}

}
