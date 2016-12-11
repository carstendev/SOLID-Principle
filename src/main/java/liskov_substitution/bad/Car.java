package liskov_substitution.bad;

public class Car extends Vehicle {

	@Override
	public void startEngine() {
		// start engine
	}

	@Override
	public void accelerate() {
		// accelerate
	}

}
