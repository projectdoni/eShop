package valueobjects;

public class Mitarbeiter extends User{

	public Mitarbeiter(String name, String number, String email, String password) {
		super(name, number, email, password);
	}

	public void addNewArticle() {
		System.out.print("hi");
	}
	
	public void increaseStock() {
		System.out.print("hi");
	}
}
