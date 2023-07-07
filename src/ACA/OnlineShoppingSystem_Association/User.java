package ACA.OnlineShoppingSystem_Association;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String name;
    private String email;
    private String address;

    User(String name, String email, String address){
        this.name = name;
        this.email = email;
        this.address = address;
    }
    void placeOrder(Order order){

            if (Objects.nonNull(order)) {
                System.out.format("%s Placed order : \nOrder: %s\nDetails: %s, %s, %s\n\n", this.name, order.getName(), order.getUser().getName(), order.getUser().getEmail(), order.getUser().getAddress());
                return;
            }
            System.out.println("Order doesn't exist");
    }

    void cancelOrder(Order order){
        if (order != null) {

            System.out.println("Order " + order.getName() + " removed");
            return;
        }
        System.out.println("Select order to remove");
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
