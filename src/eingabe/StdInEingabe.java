package eingabe;

import java.util.Scanner;

public class StdInEingabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner eingabe = new Scanner(System.in);
System.out.println("Enter first name");
String firstname = eingabe.nextLine();
System.out.println("Firstname: " + firstname);
if (eingabe.hasNextInt("[+-\\/*]")) {
	String zeichen = eingabe.next("")
	int zahl = eingabe.nextInt();
	System.out.println("Zahl: " + zahl);
}
eingabe.close();
	}

}
