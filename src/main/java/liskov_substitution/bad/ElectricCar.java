package liskov_substitution.bad;

public class ElectricCar extends Vehicle {

	@Override
	public void startEngine() {
		throw new UnsupportedOperationException("has no enigine");
	}

	@Override
	public void accelerate() {
		// accelerate
	}

}
