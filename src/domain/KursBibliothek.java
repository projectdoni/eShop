package domain;

import java.util.List;

import domain.exceptions.KursExistiertBereitsException;
import valueobjects.Kurs;


public class KursBibliothek {

	private UserManagment benutzer = new UserManagment();
	private KursManagment meineKurse = new KursManagment();
	
	public List<Kurs> gibAlleKurse() {
		// einfach delegieren an KursVerwaltung meineKurse
		return meineKurse.getKursBestand();
	}
	
	public Kurs fuegeKursEin(String kursName, int kursNummer, double preis, double kursLaenge, String sprache) throws KursExistiertBereitsException {
		Kurs b = new Kurs(kursName, kursNummer, preis, kursLaenge, sprache);
		meineKurse.einfuegen(b);
		return b;
	}
	
	public void loescheBuch(String kursName) {
		Kurs course = new Kurs(kursName);
		meineKurse.loeschen(course);
	}
}
