package ACA.Aggregation;

import java.util.List;

public class Main {
    public static void main(String args[]){
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Information Technology");

        University university = new University("ISATU");

        university.addDepartment(department1);
        university.addDepartment(department2);


        System.out.println("University: " + university.getName());

        List<Department> departments = university.getDepartments();
       /* for(int i = 0; i < departments.size(); i++){
            System.out.println("Department: " + departments.get(i));
        }*/

        for (Department department : departments) {
            System.out.println("Department: " + department.getName());
        }

    }

}
