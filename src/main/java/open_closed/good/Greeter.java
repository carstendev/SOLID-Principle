package open_closed.good;

public class Greeter {
	
	private ContactPerson person;

	public Greeter(ContactPerson person) {
		this.person = person;
	}

	public String greet() {
		return this.person.getSalutation();
	}
}