package Praktikum7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Harjutus1.TextIO;

public class Sport {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Athlete> sportlased = new ArrayList<Athlete>();
		String[] osaleja = null;
		do {
			System.out.print("Sisesta osaleja nimi ja tulemus");
			osaleja = TextIO.getlnString().split(" ");

			if (!osaleja[0].equals("")) {
				Athlete sportlane = new Athlete(
						osaleja[0],
						Double.parseDouble(osaleja[1]),
						Integer.parseInt(osaleja[2])
						);
				sportlased.add(sportlane);
			}

		} while (!osaleja[0].equals(""));

		// Sorteerime tulemuste järgi kahanevas järjekorras
		Collections.sort(sportlased, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Athlete a1 = (Athlete)o1;
				Athlete a2 = (Athlete)o2;
				
				if (a1.getResult() > a2.getResult()) {
					return -1;
				} else if (a1.getResult() < a2.getResult()) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		for (int i = 0; i < sportlased.size(); i++) {
			System.out.println(sportlased.get(i));
		}
		
		sportlased.get(0).greet();
	}

}
