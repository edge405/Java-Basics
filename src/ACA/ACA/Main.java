package ACA.ACA;

public class Main {

    public static void main(String args[]){
        University university = new University("Example University");
        Department department = new Department("Computer Science", university);
        Professor professor = new Professor("John Doe", department);

        // Association - University and Department are associated
        System.out.println("University: " + department.getUniversity().getName());

        // Aggregation - Department is part of the University
        System.out.println("Department: " + department.getName());

        // Composition - Professor is part of the Department
        System.out.println("Professor: " + professor.getName());
    }

}
