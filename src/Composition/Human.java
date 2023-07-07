package Composition;

public class Human {
    String name;

    public Human(String name){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String toString(){
        return name;
    }
}
