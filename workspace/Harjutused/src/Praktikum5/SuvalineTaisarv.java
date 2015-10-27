package Praktikum5;

public class SuvalineTaisarv {
	
	public static int suvaline(int min, int max){
		int taisarv= min+ (int) (Math.random()*(max+1-min));
		
		return taisarv;
		
	}
	public static void main(String[] args) {
		int taisarv = suvaline(660, 666);
		System.out.println("Täisarv: " + taisarv);
		}
	
}
