package Praktikum8;

import java.util.List;
import java.util.ArrayList;

public class Kaardimäng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Card> kaardipakk = Kaardipakk.AnnaKaardid();

		int[] suvalised = new int[5];
		for (int i = 0; i < suvalised.length; i++) {
			suvalised[i] = (int) (Math.random() * kaardipakk.size());
		}

		for (int suvaline : suvalised) {
			Card card = kaardipakk.get(suvaline);
			System.out.println(card.mast + " " + card.suurus);
		}
		System.out.println(Sarnased(suvalised, kaardipakk));
	}

	public static boolean Sarnased(int[] suvalised, List<Card> kaardipakk) {
		;
		
		for (int i = 0; i < suvalised.length - 1; i++) {
			for (int j = i + 1; j < suvalised.length; j++) {
				Card card = kaardipakk.get(suvalised[i]);
				Card card2 = kaardipakk.get(suvalised[j]);
				
				if(card.suurus==card2.suurus){
					return true;
				}
			}

		}
		return false;
	}
}
