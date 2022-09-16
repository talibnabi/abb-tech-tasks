package dao.abstracts;

import java.util.Collection;
import java.util.Optional;

public interface DAO<T> {
    Optional<Collection<T>> getAll();

    Optional<T> create(T data);

    Optional<T> deleteFromFile(int id);

    Optional<T> writeToFile();

}
