package Harjutus1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoTest {

	public static void main(String[] args) throws IOException {
		System.out.print("Sisesta nimi: ");
		
		
		String s =  EckExample();
		TextIO.putln(s);
	}
	
	public static void JavaExample() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
    
        System.out.print("Tere, " + s);
	}
	
	public static String  EckExample(){
		String s = TextIO.getln();
		TextIO.putln("tere, " + s);
		
		return "TEre!";
		
	}
	

}
