package Composition;

import javax.naming.Name;

public class Cat {
    String name;
    Human owner;

    public Cat(String name, Human owner){
        this.name = name;
        this.owner = owner;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Human getOwner() {
        return owner;
    }
    public void setOwner(Human owner) {
        this.owner = owner;
    }
    public String toString(){
        return String.format("%s has a cat named %s", owner, name);
    }
}
