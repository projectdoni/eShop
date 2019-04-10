package domain.exceptions;

import valueobjects.Kurs;

public class KursExistiertBereitsException extends Exception {

	public KursExistiertBereitsException(Kurs kurs, String zusatzMsg) {
		super("Kurs mit Titel " + kurs.getKursName() + " und Nummer " + kurs.getKursNummer() 
				+ " existiert bereits" + zusatzMsg);
	}
}
