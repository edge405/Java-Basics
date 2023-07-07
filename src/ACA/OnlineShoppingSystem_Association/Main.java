package ACA.OnlineShoppingSystem_Association;

public class Main {

    public static void main(String args[]){

    User user1 = new User("Edjay", "ejlindayao@gmail.com", "Iloilo");
    User user2 = new User("Yanyan", "edgelindayao@gmail.com", "Iloilo");

    Order order1 =  new Order("Phone", user1);
    Order order2 = new Order("Shorts", user2);

    user1.placeOrder(order1);
    user1.cancelOrder(order1);
    order1.removeUser();
    user1.placeOrder(order1);

    }

}
