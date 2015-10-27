package Raamatu‹l;

import Harjutus1.TextIO;

public class MituMuna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Mitu muna sul on?");
		int munad=TextIO.getlnInt();
		
		int munad1=munad/144;
		int munad2=munad%144;
		int munad3=munad2/12;
		int munad4=munad2%12;
		System.out.printf("Your number of eggs is %d gross, %d dozen, and %d", munad1, munad3, munad4);
		
		
		
	}

}
