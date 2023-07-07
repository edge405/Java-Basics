package CollectionGenerics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<User> users = new ArrayList<>();
        UserRepository userRepository = new UserRepository(users);
        UserService userService = new UserService(userRepository);


        User user1 = new User(1, "John");
        User user2 = new User(2, "Jane");


        userService.saveUser(user1);
        userService.saveUser(user2);


        User foundUser = userService.findUserById(1);
        System.out.println("Found User: " + foundUser.getName());

        List<User> allUsers = userService.findAllUsers();
        System.out.println("All Users: " + allUsers);
    }
}
