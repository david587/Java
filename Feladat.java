import java.util.Scanner;

class Feladat {
	
public static void main (String[] args) {
	System.out.println("Baráth Dávid");
	System.out.println("Feladat 0301");
	System.out.println("Kör alapú kúp térfogata");

	Scanner sc= new Scanner(System.in);
		
	System.out.print('r');
	double sugar =sc.nextDouble();//bekérés
	
	System.out.print('m');
	double magassag =sc.nextDouble();//bekérés
	
	
	double terfogat=
				(1.0/3.0)*
				Math.pow(sugar , 2)*
				Math.PI	*
				magassag;
	System.out.println("Térfogat:"+ terfogat);
	
	
	}
}

