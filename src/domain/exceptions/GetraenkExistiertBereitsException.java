package domain.exceptions;

import valueobjects.Getraenk;

public class GetraenkExistiertBereitsException extends Exception {

	public GetraenkExistiertBereitsException(Getraenk kurs, String zusatzMsg) {
		super("Kurs mit Titel " + kurs.getKursName() + " und Nummer " + kurs.getKursNummer() 
				+ " existiert bereits" + zusatzMsg);
	}
}
