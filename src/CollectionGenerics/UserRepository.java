package CollectionGenerics;

import java.util.List;

public class UserRepository implements Repository<User> {
    private List<User> users;

    public UserRepository(List<User> users) {
        this.users = users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public User findById(int id) {
        /*return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);*/
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
    @Override
    public List<User> findAll() {
        return users;
    }
}
