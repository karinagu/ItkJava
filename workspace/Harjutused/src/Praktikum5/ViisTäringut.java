package Praktikum5;

public class ViisT�ringut {
	public static int Veereta() {
		int arv = 1 + (int) (Math.random() * (6));

		return arv;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + Veereta();	
		}
		System.out.print("Viie t�ringu summa on " + sum);
	}

}
