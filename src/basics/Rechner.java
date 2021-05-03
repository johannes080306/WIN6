package basics;
import java.util.Scanner;
public class Rechner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner benutzereingabe = new Scanner(System.in);

		
		
		double ersteZahl;
		double zweiteZahl;
				char operator;
		
		System.out.println("Zahl1 (wird verwendet bei hoch und wurzel) :");
		ersteZahl = benutzereingabe.nextDouble();
		
		System.out.println("Zahl2 :");
		zweiteZahl = benutzereingabe.nextDouble();
		
		System.out.println("Rechenzeichen ( +, -, *, /, ^, [):");
		operator = benutzereingabe.next().charAt(0);
		
		if (operator == '*') {
			System.out.println(ersteZahl * zweiteZahl);
		} else if (operator == '/') {
			System.out.println(ersteZahl / zweiteZahl);
		} else if (operator == '+') {
			System.out.println(ersteZahl + zweiteZahl);
		} else if (operator == '-') {
			System.out.println(ersteZahl - zweiteZahl);
		} else if (operator == '^') {
			int ergebnis = (int) Math.pow(ersteZahl, 2);
			System.out.println(ergebnis);
		} else if (operator == '[') {
			System.out.println(Math.sqrt(ersteZahl));	
		} else {
			System.out.println("Ist kein Rechenzeichen");
		}		
		
		
		
		
		
	}
}	
		