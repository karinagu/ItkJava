package Praktikum8;

import java.util.ArrayList;
import java.util.List;

public class Kaardipakk {
	public static List<Card> AnnaKaardid() {
		List<Card> kaardipakk = new ArrayList<Card>();
		for (Suite suite : Suite.values()) {
			for (Rank rank : Rank.values()) {
				Card card = new Card();
				card.mast = suite;
				card.suurus = rank;
				kaardipakk.add(card);
			}
		}
		
		return kaardipakk;
	}
}
