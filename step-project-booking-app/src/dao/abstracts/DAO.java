package dao.abstracts;

import enumeration.concretes.data.BookingDataSource;

import java.util.Collection;
import java.util.Optional;

public interface DAO<T> {
    Optional<Collection<T>> getAll();

    Boolean create(T data);

    Boolean deleteFromFile(int id);

    Boolean writeToFile();

}
