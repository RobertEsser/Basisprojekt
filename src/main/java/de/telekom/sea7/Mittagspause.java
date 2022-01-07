package de.telekom.sea7;
import java.util.Scanner;

public class Mittagspause {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
					
		while (true) {
								
			System.out.println("Bitte um Eingabe Vorname");
			String eingabeV = scanner.next();
			if (eingabeV.equals("exit"))
				break;
			System.out.println("Bitte um Eingabe Nachname");
			String eingabeN = scanner.next();
			if (eingabeN.equals("exit"))
				break;
			System.out.println("Sie haben " + eingabeV + " " + eingabeN + " eingegeben" );
			
			
			
		}
		System.out.println ("Exit eingegeben, das wars");
		scanner.close();
	}
}


