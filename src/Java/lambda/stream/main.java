package Java.lambda.stream;

import java.util.*;
import java.util.stream.Collectors;

public class main {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            peopleBusinessLogic peoples = new peopleBusinessLogic();

            System.out.print("Enter how many people you want to add: ");
            int people = s.nextInt();
            s.nextLine();
            for(int i = 1; i <= people; i++) {

                System.out.format("Enter name %d: ", i);
                String name = s.nextLine();

                System.out.format("Enter age %d: ", i);
                int age = s.nextInt();
                s.nextLine();

                System.out.format("Enter sex %d: ", i);
                String sex = s.nextLine();

            /*
            Inject all the information inputted to addPeople method in the peoples
            object created from peopleBusinessLogic class
             */
                peoples.addPeople(new People(name, age, sex));
            }
            System.out.println();
            List<People> peopleList = peoples.getPeopleList();
            /*
             * get the all people information list and print
             */
            for(People eachPeopleInfo : peopleList){
                System.out.println(eachPeopleInfo);
            }
            System.out.println();

        /* if you want to get the people that less than 20 of their age, you can use stream()
        this is a lambda expression, learn lambda first before learning stream()
        lambda expression is less the code and easy to understand.
         */
            List<People> filteredPeopleList = peopleList.stream().filter(peps -> peps.getAge() < 20).collect(Collectors.toList());
            filteredPeopleList.forEach(peps -> System.out.println("people that less than 20 age: " + peps));



        }
    }
