package Raamatu�l;

import Harjutus1.TextIO;

public class PeenrahaLugemine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Kui palju on sul 25-sendiseid");
int kahek�mneviiene=TextIO.getlnInt();
System.out.println("Kui palju on sul 10-sendiseid");
int k�mneseid=TextIO.getlnInt();
System.out.println("Kui palju on sul 5-sendiseid");
int viieseid=TextIO.getlnInt();
System.out.println("Kui palju on sul 1-sendiseid");
int �heseid=TextIO.getlnInt();

double kokku=(kahek�mneviiene*0.25)+(k�mneseid*0.10)+(viieseid*0.05)+(�heseid*0.01);
System.out.printf("Sul on %1.2f eurot", kokku);
	}

}
