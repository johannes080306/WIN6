package basics;

import java.util.Scanner;

public class Rechner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Taschenrechner");
		System.out.println("Bitte geben Sie die erste Zahl ein!");
		double Zahl = 0;
		double Ergebniss = 0;
		Scanner eingabe = new Scanner(System.in);

		while (true) {
			if (eingabe.hasNext("[q]")) {
				System.out.println("Der rechner ist aus");

				break;

			}

			if (eingabe.hasNext("[0-9]+\\,{0,1}[0-9]*")) {
				Zahl = eingabe.nextDouble();
				System.out.println("Zahl1: " + Zahl);
				System.out.println("Bitte geben Sie den Rechenoperator (+ - * / s ] ) an!");
				continue;

			}

			if (eingabe.hasNext("[]]")) {
				String zeichen = eingabe.next("[]]");
				Ergebniss = (Math.sqrt(Zahl));
				Zahl = Ergebniss;
				System.out.println(Ergebniss);
				continue;
			}
			System.out.println("Bitte geben Sie die zweite Zahl ein!");
			if (eingabe.hasNext("[+]")) {
				String zeichen = eingabe.next("[+]");
				Ergebniss = (Zahl + eingabe.nextDouble());
				Zahl = Ergebniss;
				System.out.println(Ergebniss);
				continue;
			}

			if (eingabe.hasNext("[-]")) {
				String zeichen = eingabe.next("[-]");
				Ergebniss = (Zahl - eingabe.nextDouble());
				Zahl = Ergebniss;
				System.out.println(Ergebniss);
				continue;
			}

			if (eingabe.hasNext("[\\/]")) {
				String zeichen = eingabe.next("[\\/]");
				Ergebniss = (Zahl / eingabe.nextDouble());
				Zahl = Ergebniss;
				System.out.println(Ergebniss);
				continue;
			}

			if (eingabe.hasNext("[*]")) {
				String zeichen = eingabe.next("[*]");
				Ergebniss = (Zahl * eingabe.nextDouble());
				Zahl = Ergebniss;
				System.out.println(Ergebniss);
				continue;
			}

			if (eingabe.hasNext("[s]")) {
				String zeichen = eingabe.next("[s]");
				Ergebniss = (Math.pow(Zahl, eingabe.nextDouble()));
				Zahl = Ergebniss;
				System.out.println(Ergebniss);
				continue;

			}
if (eingabe.hasNext())
	eingabe.next();
		}
	}
}
