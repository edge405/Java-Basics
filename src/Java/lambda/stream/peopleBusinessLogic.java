package Java.lambda.stream;

import java.util.*;

public class peopleBusinessLogic {

    List<People> peopleList = new ArrayList<>();

    //add people to the list
    public void addPeople(People people){
        this.peopleList.add(people);
    }

    //get all the people from the list
    public List<People> getPeopleList(){
        return this.peopleList;
    }
}
