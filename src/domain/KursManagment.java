package domain;

import java.util.List;
import java.util.Vector;
import valueobjects.Kurs;

public class KursManagment {
	
	private List<Kurs> kursBestand = new Vector<Kurs>();
	
	public List<Kurs> getKursBestand() {
		return new Vector<Kurs>(kursBestand);
	}
}
