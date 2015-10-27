package RaamatuÜl;

import Harjutus1.TextIO;

public class PeenrahaLugemine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Kui palju on sul 25-sendiseid");
int kahekümneviiene=TextIO.getlnInt();
System.out.println("Kui palju on sul 10-sendiseid");
int kümneseid=TextIO.getlnInt();
System.out.println("Kui palju on sul 5-sendiseid");
int viieseid=TextIO.getlnInt();
System.out.println("Kui palju on sul 1-sendiseid");
int üheseid=TextIO.getlnInt();

double kokku=(kahekümneviiene*0.25)+(kümneseid*0.10)+(viieseid*0.05)+(üheseid*0.01);
System.out.printf("Sul on %1.2f eurot", kokku);
	}

}
