package Kontrolltöö;

public class Katse2Ül2 {

	public static void main(String[] args) {
		System.out.println(valiVahemik(37));
		// YOUR TESTS HERE
	}

	public static int valiVahemik(int m) {
		if (m < 10) {
			return 0;
		}
		if (m >= 10 && m <= 35) {
			return 1;
		} else {
			return 2;
		}
	}

}
