package valueobjects;

public class Kunde extends User{
	private String street;
	private String place;
	private int zipCode;
	
	Warenkorb warenkorb;
	
	public Kunde(String name, String number, String email, String password, String street, String place, int zipCode) {
		super(name, number, email, password);
		this.street = street;
		this.place = place;
		this.zipCode = zipCode;
	}
	

	

}

