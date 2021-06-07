package basics;

import java.util.Scanner;

public class Rechner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eingabe = new Scanner(System.in);
		int ersteZahl = 0;
		while (true) {
			if (eingabe.hasNext("[q]")) {
				System.out.println("Der rechner ist aus");

				break;

			}

			

			if (eingabe.hasNextInt()) {
				ersteZahl = eingabe.nextInt();

				System.out.println("Zahl1: " + ersteZahl);

				continue;

			}

			if (eingabe.hasNext("[]]")) {
				String zeichen = eingabe.next("[]]");
				System.out.println(Math.sqrt(ersteZahl));
				continue;
			}

			if (eingabe.hasNext("[+]")) {
				String zeichen = eingabe.next("[+]");
				System.out.println(ersteZahl + eingabe.nextInt());
				continue;
			}
			if (eingabe.hasNext("[-]")) {
				String zeichen = eingabe.next("[-]");
				System.out.println(ersteZahl - eingabe.nextInt());
				continue;
			}
			if (eingabe.hasNext("[\\/]")) {
				String zeichen = eingabe.next("[/]");
				System.out.println(ersteZahl / eingabe.nextInt());
				continue;
			}
			if (eingabe.hasNext("[+]")) {
				String zeichen = eingabe.next("[+]");
				System.out.println(ersteZahl + eingabe.nextInt());
				continue;
			}
			if (eingabe.hasNext("[^]")) {
				String zeichen = eingabe.next("[^]");
				System.out.println(Math.pow(ersteZahl, eingabe.nextInt()));
				continue;
			}
			eingabe.close();

		}
	}
}
