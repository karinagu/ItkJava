package Praktikum7;

public class SuuredTahedKriipsuga {
	public static void main(String[] args) {
		String sona = "Tere tore";
		sona = sona.toUpperCase();
		for (int i = 0; i < sona.length(); i++) {
			if (i == sona.length() - 1 || sona.charAt(i)==' '||sona.charAt(i+1)==' ')  {
				System.out.print(sona.charAt(i));
			} else {
				System.out.format("%s-", sona.charAt(i));
			}

		}
	}
}
