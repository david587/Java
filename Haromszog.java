import java.util.Scanner;

public class Haromszog {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Barárh dávid");
		System.out.println("Feladat:0306");
		System.out.println("2022.02.16");
		
		System.out.print("Oldal:");
		double oldal =sc.nextDouble();

		System.out.print("Magaság");
		double magassag = sc.nextDouble();
		
		double terület=(oldal*magassag)/2;
		
		System.out.println("A terület:"+terület);
		
	}
}

