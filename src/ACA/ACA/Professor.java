package ACA.ACA;

public class Professor {
    private String name;
    private Department department;

    public Professor(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

}
