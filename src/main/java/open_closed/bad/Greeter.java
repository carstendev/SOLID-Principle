package open_closed.bad;

public class Greeter {

	private String formality;

	public String greet() {
		if (this.formality == "formal") {
			return "Hello, sir.";
		} else if (this.formality == "casual") {
			return "Hey";
		} else if (this.formality == "intimate") {
			return "Hello honey!";
		} else {
			return "Hello.";
		}
	}

	public void setFormality(String formality) {
		this.formality = formality;
	}
}