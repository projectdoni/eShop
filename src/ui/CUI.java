package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import domain.KursBibliothek;
import domain.exceptions.KursExistiertBereitsException;
import valueobjects.Kurs;

public class CUI {

	//*private Bibliothek bib ist Schnittstelle 
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private KursBibliothek bib = new KursBibliothek();
	
	/**
	 * Die main-Methode...
	 */
	public static void main(String[] args) {
		CUI cui;
			cui = new CUI();
			cui.run();
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
			printOutGuest();
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
		System.out.print("         \n  Artikel suchen:  's'");
		System.out.print("         \n  Zum Warenkorb hinzufuegen: 'd'");
		System.out.print("         \n  Artikel kaufen:  'e'");
		System.out.print("         \n  ---------------------");
		System.out.println("         \n  Beenden:        'q'");
		System.out.print("> "); // Prompt
		System.out.flush(); // ohne NL ausgeben
	}
	private void printOutStaff() {
		System.out.print("         \n  Ausloggen:  'f'");
		System.out.print("         \n  Kurse anzeigen: 'b'");
		System.out.print("         \n  Kurs loeschen: 'l'");
		System.out.print("         \n  Kurs hinzufuegen: 'h'");
		System.out.print("         \n  Kurs suchen:  's'");
		System.out.print("         \n  Zum Warenkorb hinzufuegen: 'd'");
		System.out.print("         \n  Artikel kaufen:  'e'");
		System.out.print("         \n  ---------------------");
		System.out.println("         \n  Beenden:        'q'");
		System.out.print("> "); // Prompt
		System.out.flush(); // ohne NL ausgeben
	}
	
	private void printOutGuest() {
		System.out.print("         \n  Einloggen:  'a'");
		System.out.print("         \n  Kurs suchen:  's'");
		System.out.print("         \n  Alle Kurse anzeigen:  'b'");
		System.out.print("         \n  ---------------------");
		System.out.println("       \n  Beenden:        'q'");
		System.out.print("> "); // Prompt
		System.out.flush(); // ohne NL ausgeben
	}
	
	
	private String liesEingabe() throws IOException {
		// einlesen von Konsole
		return in.readLine();
	}
	
	private void verarbeiteEingabe(String line) throws IOException {
		int kursNummer;
		String nr;
		String nr1;
		String nr2;
		String kursName;
		double preis;
		double kursLaenge;
		String sprache;
		List<Kurs> liste;
		
		// Eingabe bearbeiten:
		switch (line) {
		
		case "a":
			// Einloggen
			break;
			
		case "b":
			liste = bib.gibAlleKurse();
			gibKurslisteAus(liste);
			break;
			
		case "f":
			// Ausloggen
			break;
			
		case "l":
			// Kurs l�schen
			break;
			
		case "s":
			// Kurs suchen
			break;	
			
		case "h":
			System.out.print("Kursnummer > ");
			nr = liesEingabe();
			kursNummer = Integer.parseInt(nr);
			System.out.print("Kurstitel  > ");
			kursName = liesEingabe();
			System.out.print("Preis > ");
			nr1 = liesEingabe();
			preis = Double.parseDouble(nr1);
			System.out.print("Videolaenge > ");
			nr2 = liesEingabe();
			kursLaenge = Double.parseDouble(nr2);
			System.out.print("Sprache > ");
			sprache = liesEingabe();
			

			try {
				bib.fuegeKursEin(kursName, kursNummer, preis, kursLaenge, sprache);
				System.out.println("Einfuegen ok");
			} catch (KursExistiertBereitsException e) {
				// Hier Fehlerbehandlung...
				System.out.println("Fehler beim Einfügen");
				e.printStackTrace();
			}
			break;
			
		case "d":
			// Zum Warenkorb hinzufuegen
			break;
			
		case "e":
			// Kurs kaufen
			break;
			
		}
	}
	
	/* 
	 * 
	 * Interne (private) Methode zum Ausgeben von Kurslisten.
	 *
	 */
	
	private void gibKurslisteAus(List<Kurs> liste) {
		if (liste.isEmpty()) {
			System.out.println("Liste ist leer.");
		} else {
			for (Kurs kurs: liste) {
				System.out.println(kurs.toString());				
			}
		}
	}
	
	
}
