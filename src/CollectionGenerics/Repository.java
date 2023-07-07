package CollectionGenerics;
import java.util.List;
public interface Repository <T> {
    void save(T item);
    T findById(int id);
    List<T> findAll();
}
