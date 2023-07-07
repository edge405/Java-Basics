package Composition;

public class Main {

    public static void main(String args[]){
        Human per1 = new Human("Edjay");
        Cat myCat = new Cat("Browny", per1);

        System.out.println(myCat);
    }
}
