package ACA.Association;

public class Main {
    public static void main(String args[]){

        Car car = new Car("Toyota Camry");
        Person person = new Person("John Doe", car);

        System.out.println("Person: " + person.getName());
        System.out.println("Car: " + person.getCar().getModel());
    }
}
