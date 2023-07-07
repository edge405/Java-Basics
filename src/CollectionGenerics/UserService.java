package CollectionGenerics;
import java.util.List;

public class UserService {
    private Repository<User> userRepository;

    public UserService(Repository<User> userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User findUserById(int id) {
        return userRepository.findById(id);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
