package valueobjects;

public class Getraenk {

	private String kursName;
	private int kursNummer;
	private double preis;
	private double kursLaenge;
	private String sprache;
	


	public Getraenk(String kursName, int kursNummer, double preis, double kursLaenge, String sprache ) {
	this.kursName = kursName;
	this.kursNummer = kursNummer;
	this.preis = preis;
	this.kursLaenge = kursLaenge;
	this.sprache = sprache;
	}
	
	public Getraenk(String kursName) {
		// TODO Auto-generated constructor stub
		this.kursName = kursName;
	}

	public double getPreis() {
		return preis;
	}

	public double getKursLaenge() {
		return kursLaenge;
	}

	public String getSprache() {
		return sprache;
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
		if (anderesObjekt instanceof Getraenk) {
			Getraenk andererKurs = (Getraenk) anderesObjekt;
			return ((this.kursNummer == andererKurs.kursNummer)
					&& (this.kursName.equals(andererKurs.kursName)));
		} 
		return false;
	}
	
	// Methode, damit Kursinfo ausgegeben werden kann
@Override
	public String toString() {
		String kursInfo;
		kursInfo = "\n Name, Nummer: " + getKursName() + ", " + getKursNummer() + "\n Preis: " + getPreis() + "\n Kursdauer: " + getKursLaenge() + "\n Sprache: " + getSprache();
		return kursInfo;
	}

	
}
