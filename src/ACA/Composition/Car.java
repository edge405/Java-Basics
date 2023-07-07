package ACA.Composition;

public class Car {
    private String make;
    private Engine engine;

    public Car(String make, String engineModel) {
        this.make = make;
        this.engine = new Engine(engineModel);
    }

    public String getMake() {
        return make;
    }

    public Engine getEngine() {
        return engine;
    }
}
