package domain;

import java.util.List;

import valueobjects.Kurs;


public class KursBibliothek {

	private UserManagment benutzer;
	private KursManagment meineKurse;
	
	public List<Kurs> gibAlleKurse() {
		// einfach delegieren an DoenerVerwaltung meineDoener
		return meineKurse.getKursBestand();
	}
}
