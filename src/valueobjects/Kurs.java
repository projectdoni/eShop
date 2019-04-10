package valueobjects;

public class Kurs {

	private String kursName;
	private int kursNummer;
	private double preis;
	private double kursLaenge;
	private String sprache;
	
	public Kurs(String kursName, int kursNummer, double preis, double kursLaenge, String sprache ) {
	this.kursName = kursName;
	this.kursNummer = kursNummer;
	this.preis = preis;
	this.kursLaenge = kursLaenge;
	this.sprache = sprache;
	}
	
	public String getKursName() {
		return kursName;
	}

	public void setKursName(String kursName) {
		this.kursName = kursName;
	}

	public int getKursNummer() {
		return kursNummer;
	}

	public void setKursNummer(int kursNummer) {
		this.kursNummer = kursNummer;
	}

	public boolean equals(Object anderesObjekt) {
		if (anderesObjekt instanceof Kurs) {
			Kurs andererKurs = (Kurs) anderesObjekt;
			return ((this.kursNummer == andererKurs.kursNummer)
					&& (this.kursName.equals(andererKurs.kursName)));
		} 
		return false;
	}


	
}
