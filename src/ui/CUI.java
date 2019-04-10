package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class CUI {

	//*private Bibliothek bib ist Schnittstelle 
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	
	/**
	 * Die main-Methode...
	 */
	public static void main(String[] args) {
		CUI cui;
		try {
			cui = new CUI();
			cui.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	/**
	 * Methode zur Ausführung der Hauptschleife:
	 * - Menü ausgeben
	 * - Eingabe des Benutzers einlesen
	 * - Eingabe verarbeiten und Ergebnis ausgeben
	 * (EVA-Prinzip: Eingabe-Verarbeitung-Ausgabe)
	 */
	public void run() {
		// Variable für Eingaben von der Konsole
		String input = ""; 
	
		// Hauptschleife der Benutzungsschnittstelle
		do {
			gibMenueAus();
			try {
				input = liesEingabe();
				verarbeiteEingabe(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (!input.equals("q"));
	}
	
private void printOutCoustomer() {
		
		System.out.print("         \n  Ausloggen:  'f'");
		System.out.print("         \n  Artikel löschen: 'b'");
		System.out.print("         \n  Artikel suchen:  'c'");
		System.out.print("         \n  Zum Warenkorb hinzufuegen: 'd'");
		System.out.print("         \n  Artikel kaufen:  'e'");
		System.out.print("         \n  ---------------------");
		System.out.println("         \n  Beenden:        'q'");
		System.out.print("> "); // Prompt
		System.out.flush(); // ohne NL ausgeben
	}
	private void printOutStuff() {
		System.out.print("         \n  Ausloggen:  'f'");
		System.out.print("         \n  Artikel löschen: 'b'");
		System.out.print("         \n  Artikel suchen:  'c'");
		System.out.print("         \n  Zum Warenkorb hinzufuegen: 'd'");
		System.out.print("         \n  Artikel kaufen:  'e'");
		System.out.print("         \n  ---------------------");
		System.out.println("         \n  Beenden:        'q'");
		System.out.print("> "); // Prompt
		System.out.flush(); // ohne NL ausgeben
	}
	
	
	private String liesEingabe() throws IOException {
		// einlesen von Konsole
		return in.readLine();
	}
	
	private void verarbeiteEingabe(String line) throws IOException {
		String nummer;
		int nr;
		String titel;
		//List<Buch> liste;
		
		// Eingabe bearbeiten:
		switch (line) {
		case "a":
			//liste = bib.gibAlleBuecher();
			//gibBuecherlisteAus(liste);
			break;
		case "d":
			// lies die notwendigen Parameter, einzeln pro Zeile
			System.out.print("Buchnummer > ");
			nummer = liesEingabe();
			nr = Integer.parseInt(nummer);
			System.out.print("Buchtitel  > ");
			titel = liesEingabe();

			//bib.loescheBuch(titel, nr);
			
			break;
			
		case "e":
			// lies die notwendigen Parameter, einzeln pro Zeile
			System.out.print("Buchnummer > ");
			nummer = liesEingabe();
			nr = Integer.parseInt(nummer);
			System.out.print("Buchtitel  > ");
			titel = liesEingabe();

			try {
			//	bib.fuegeBuchEin(titel, nr);
				System.out.println("Einfügen ok");
			} catch (/*BuchExistiertBereits*/Exception e) {
				// Hier Fehlerbehandlung...
				System.out.println("Fehler beim Einfügen");
				e.printStackTrace();
			}
			break;
			
		case "f":
			System.out.print("Buchtitel  > ");
			titel = liesEingabe();
			//liste = bib.sucheNachTitel(titel);
			//gibBuecherlisteAus(liste);
			break;
			
		case "s":
			//bib.schreibeBuecher();
		
		}
	}
	
	/*private void gibBuecherlisteAus(List<Buch> liste) {
		if (liste.isEmpty()) {
			System.out.println("Liste ist leer.");
		} else {
			for (Buch buch: liste) {
				System.out.println(buch);				
			}
		}
	}*/ 
	
	
}
