package RaamatuÜl;

import Harjutus1.TextIO;

public class VeeretaTäringut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int veeretus1=(int) ((Math.random()*6) + 1);
		int veeretus2=(int) ((Math.random()*6) + 1);
		int kokku=veeretus1+veeretus2;
		
		System.out.println("esimene veeretus  "+veeretus1);
		System.out.println("teine veeretus  "+veeretus2);
		System.out.println("Kokku said  "+kokku);
		
		
		

	}

}
