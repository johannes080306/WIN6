package basics;
import java.util.Scanner;
public class Rechner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eingabe = new Scanner(System.in);

		while (true) {
			if (eingabe.hasNext("[q]")) {
				System.out.println("Der rechner ist aus");

				break;
				
				
			}
				
				
				if (eingabe.hasNextInt()) {
					int ersteZahl = eingabe.nextInt();

					System.out.println("Zahl1: " + ersteZahl);

					continue;
				
				
					if (eingabe.hasNextInt()) {
						int zweiteZahl = eingabe.nextInt();

						System.out.println("Zahl2: " + zweiteZahl);
						continue;
						
				
						String operator = eingabe.next("[+-\\\\/*^]");
					
					

					if (eingabe.hasNext("[+]")) {
						
						System.out.println(ersteZahl + zweiteZahl);
						
					} else if (eingabe.hasNext("[-]")) {
						
						System.out.println(ersteZahl - zweiteZahl);
					} else if (eingabe.hasNext("[\\/]")){
						
						System.out.println(ersteZahl / zweiteZahl);
					} else if (eingabe.hasNext("[*]")) {
						
						System.out.println(ersteZahl * zweiteZahl);
					} else if (eingabe.hasNext("[^]")) {
						
						int ergebnis = (int) Math.pow(ersteZahl, zweiteZahl);
						System.out.println(ergebnis);
					} else if (eingabe.hasNext("[]]")) {
						
						System.out.println(Math.sqrt(ersteZahl));	
					} 
					
					
					
					
				

					
				
					
				

	
			

			
				

		

					
		
		
				
					}}				}}}

		