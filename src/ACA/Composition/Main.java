package ACA.Composition;

public class Main {
    public static void main(String args[]){

        Car car = new Car("Toyota", "V6");

        System.out.println("Car Make: " + car.getMake());
        System.out.println("Engine Model: " + car.getEngine().getModel());
    }
}
