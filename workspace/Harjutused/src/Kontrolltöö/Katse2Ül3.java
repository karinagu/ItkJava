package Kontrolltöö;

public class Katse2Ül3 {

	public static void main(String[] args) {
		System.out.println(ruutudeSumma(new int[] {2,3,2}));
		// YOUR TESTS HERE
	}

	public static int ruutudeSumma(int[] m) {
		int summa=0;
		for (int i = 0; i < m.length; i++) {
			int ruudus=m[i]*m[i];
			summa= ruudus+summa;
		}
				
		return summa; // YOUR PROGRAM HERE
	}

}
