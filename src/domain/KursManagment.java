package domain;
import bib.local.valueobjects.Kurs;
import java.util.List;
import java.util.Vector;


import domain.exceptions.KursExistiertBereitsException;
import valueobjects.Kurs;

public class KursManagment {
	
	private List<Kurs> kursBestand = new Vector<Kurs>();
	
	public List<Kurs> getKursBestand() {
		return new Vector<Kurs>(kursBestand);
	}
	
	public void einfuegen(Kurs einKurs) throws KursExistiertBereitsException {
		if (kursBestand.contains(einKurs)) {
			throw new KursExistiertBereitsException(einKurs, " - in 'einfuegen()'");
		}

		// das uebernimmt die KursListe:
		kursBestand.add(einKurs);
	}
	
	public void loeschen(Kurs einKurs) {
		kursBestand.remove(einKurs);
	}
}
