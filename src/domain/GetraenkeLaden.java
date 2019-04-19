package domain;

import java.util.List;

import domain.exceptions.GetraenkExistiertBereitsException;
import valueobjects.Getraenk;


public class GetraenkeLaden {

	private UserManagment benutzer = new UserManagment();
	private GetraenkeManagment meineGetraenke = new GetraenkeManagment();
	
	public List<Getraenk> gibAlleGetraenke() {
		// einfach delegieren an KursVerwaltung meineKurse
		return meineGetraenke.getGetraenkBestand();
	}
	
	public Getraenk fuegeGetraenkEin(String kursName, int kursNummer, double preis, double kursLaenge, String sprache) throws GetraenkExistiertBereitsException {
		Getraenk b = new Getraenk(kursName, kursNummer, preis, kursLaenge, sprache);
		meineGetraenke.einfuegen(b);
		return b;
	}
	
	public void loescheGetraenk(String kursName) {
		Getraenk course = new Getraenk(kursName);
		meineGetraenke.loeschen(course);
	}
}
