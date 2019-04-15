package domain;
import java.util.List;
import java.util.Vector;


import domain.exceptions.GetraenkExistiertBereitsException;
import valueobjects.Getraenk;

public class GetränkeManagment {
	
	private List<Getraenk> getraenkBestand = new Vector<Getraenk>();
	
	public List<Getraenk> getGetraenkBestand() {
		return new Vector<Getraenk>(getraenkBestand);
	}
	
	public void einfuegen(Getraenk einGetraenk) throws GetraenkExistiertBereitsException {
		if (getraenkBestand.contains(einGetraenk)) {
			throw new GetraenkExistiertBereitsException(einGetraenk, " - in 'einfuegen()'");
		}

		// das uebernimmt die KursListe:
		getraenkBestand.add(einGetraenk);
	}
	
	public void loeschen(Getraenk einGetraenk) {
		getraenkBestand.remove(einGetraenk);
	}
}
