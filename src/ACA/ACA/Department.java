package ACA.ACA;

public class Department {
    private String name;
    private University university;

    public Department(String name, University university) {
        this.name = name;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public University getUniversity() {
        return university;
    }
}
