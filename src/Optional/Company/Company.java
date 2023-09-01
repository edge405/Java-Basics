package Optional.Company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Company {

    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**We use Optional here because if the employee ID does not exist it will return null. If you don't familiar with my code
     * try to learn lambda expression first and if you are comfortable with lambda just dive into stream() because it enchances
     * the code and easy to understand. */
    public Optional<Employee> findEmployeeById(int id) {
        return employees.stream()
                .filter(e -> e.getId() == id)
                .findFirst();
    }

    public List<Employee> getSubordinatesOfManager(int managerId) {
        Optional<Employee> manager = findEmployeeById(managerId);
        return manager.map(emp -> emp.getSubordinates())
                .orElse(Collections.emptyList());
    }


}
