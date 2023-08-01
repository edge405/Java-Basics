package Java.lambda.stream;

import java.util.*;

public class peopleBusinessLogic {

    List<People> peopleList = new ArrayList<>();

    public void addPeople(People people){
        this.peopleList.add(people);
    }

    public List<People> getPeopleList(){
        return this.peopleList;
    }
}
