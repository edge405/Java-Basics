package Optional.Company;

import java.util.*;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /**Creating an Object called company for Company class*/
        Company company = new Company();

        /**Creates an Objects for Employee class*/
        Employee ceo = new Employee(1, "CEO");
        Employee manager1 = new Employee(2, "Manager 1");
        Employee manager2 = new Employee(3, "Manager 2");
        Employee employee1 = new Employee(4, "Employee 1");
        Employee employee2 = new Employee(5, "Employee 2");

        /**Adding a subordinate for ceo and also for manager*/
        ceo.addSubordinate(manager1);
        ceo.addSubordinate(manager2);
        manager1.addSubordinate(employee1);
        manager2.addSubordinate(employee2);

        /**Adding employee to a company*/
        company.addEmployee(ceo);
        company.addEmployee(manager1);
        company.addEmployee(manager2);
        company.addEmployee(employee1);
        company.addEmployee(employee2);

        /**User input for target ID*/
        System.out.println("Enter target id: ");
        int targetId = s.nextInt();

        /**findEmployeeById() method returns a Optional of Employee so we just store it into Optional of variable manager so that we can easily manipulate*/
        Optional<Employee> manager = company.findEmployeeById(targetId);

        /**Loops a manager object containing the worker name and their subordinates with the target value of whatever the user inputted*/
        if (manager.isPresent()) {
            System.out.println("Manager found: " + manager.get().getName());
            List<Employee> subordinates = company.getSubordinatesOfManager(targetId);
            if (!subordinates.isEmpty()) {
                System.out.println("Subordinates:");
                subordinates.forEach(subordinate -> System.out.println(subordinate.getName()));
            } else {
                System.out.println("No subordinates found for this manager.");
            }
        } else {
            System.out.println("Manager with ID " + targetId + " not found.");
        }
    }
}
