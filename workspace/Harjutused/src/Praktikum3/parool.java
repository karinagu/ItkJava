package Praktikum3;

import Harjutus1.TextIO;

public class parool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Sisesta parool ");
		
		String input = TextIO.getlnString();
		String parool ="32T12v";
		if (input.equals (parool)){
			System.out.print("Parool õige");
		}
		else {
			System.out.print("Parool vale");
		}
	}

}
