package Kest;

import Harjutus1.TextIO;

public class kest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// rakendus k�siks kas soovin v�ljuda, kui ja siis vajutada J ja v�ljub.
		// vastasel juhul k�sib uuesti, kas v�ljuda
		
		
	}
	
	private void ts(){
		for (int i = 0; i < 10; i++) {
			// TextIO.putln(i);
		}

		int[] test = new int[] { 1, 4, 5, 7 };

		for (int i : test) {
			// TextIO.put(i);
		}

		int x = 12;
		while (x < 10) {
			x = x * 2;
			TextIO.put(x);
		}
		TextIO.putln();
		do {
			x = x-4;	
			TextIO.put(x);
		}while(x > 40);
	}

}
