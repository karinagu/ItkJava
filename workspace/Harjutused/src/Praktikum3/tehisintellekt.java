package Praktikum3;

import Harjutus1.TextIO;

public class tehisintellekt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Sisesta naise vanus ");
		int input1 = TextIO.getlnInt();
		System.out.print("Sisesta mehe vanus ");
		int input2 = TextIO.getlnInt();
		int vahe = Math.abs(input1 -input2);
		if (vahe >=5 && vahe <10) {
			System.out.print("vanuse vahe suht okei");
		}
		else if (vahe >=10 && vahe <15){
			System.out.print("vanuse vahe veits kahtlane");
		}
		else if (vahe >= 15) {
			System.out.print("vanuse vahe ei ole okei");
		}
		else if (vahe < 5) {
			System.out.print("vanuse vahe sobib");
		}
		}

}
