package ACA.OnlineShoppingSystem_Association;

public class Order {

    private String name;
    private User user;


    Order(String name, User user){
        this.name = name;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public User getUser() {
        return user;
    }

    public void removeUser() {
        this.user = null;
    }

}
