package Praktikum6;

import java.util.Collections;

import Harjutus1.TextIO;

public class TagurpidiNimi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Sisesta nimi");
		String nimi = TextIO.getlnString();
		String nimep = "";
		for (int i = nimi.length(); i > 0; i--) {
			nimep = nimep+ nimi.charAt(i - 1);
		}
		System.out.print(nimep);

		// System.out.print(nimi.charAt(i-1));

	}

}
