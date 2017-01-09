package liskov_substitution.good;

public class Car extends Vehicle {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startEngine() {
        engine.start();
    }

    @Override
    public void accelerate() {
        // accelerate
    }

}
