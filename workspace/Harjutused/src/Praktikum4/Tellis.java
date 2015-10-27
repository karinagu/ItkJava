package Praktikum4;


	public class Tellis {
		   
		   public static void main (String[] param) {
		  System.out.println(mahub(10,20,3,4,5));
		   }
		   

		   public static boolean mahub (double a, double b, double c, 
		                            double x, double y) {
			   
			   if(mahub2(a,b,x, y)) return true;
			   
			   if(mahub2(a,c,x, y)) return true;
			   
			   if(mahub2(b,c,x, y)) return true;
			   
		      return false; // TODO!!! YOUR CODE HERE!
		   }
		  
		   public static boolean mahub2 (double i,double j, double x,double y){
			   if(i<=x && j<=y || j<=x && i<=y){
				   return true;
			   }
			   
			   	return false;
		   } 
}