package domain;

import java.util.List;
import java.util.Vector;


import domain.exceptions.KursExistiertBereitsException;
import valueobjects.Kurs;

public class KursManagment {
	
	private List<Kurs> kursBestand = new Vector<Kurs>(500);
	
	public List<Kurs> getKursBestand() {
		return new Vector<Kurs>(kursBestand);
	}
	
	public void einfuegen(Kurs einKurs) throws KursExistiertBereitsException {
		if (kursBestand.contains(einKurs)) {
			throw new KursExistiertBereitsException(einKurs, " - in 'einfuegen()'");
		}

		// das uebernimmt die BuchListe:
		kursBestand.add(einKurs);
	}
}
