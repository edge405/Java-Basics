package Optional.Company;

import java.util.ArrayList;
import java.util.List;
public class Employee {
    private int id;
    private String name;
    private List<Employee> subordinates;

    /**If object is created and pass some data to parameter. the subordinates List will become ArrayList.
     * and can perform the other methods such as addSubordinate */
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

}
