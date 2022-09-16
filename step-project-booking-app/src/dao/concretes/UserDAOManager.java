package dao.concretes;

import dao.abstracts.DAO;
import entity.User;

import java.util.Collection;
import java.util.Optional;

public class UserDAOManager implements DAO<User> {
    @Override
    public Optional<Collection<User>> getAll() {
        return Optional.empty();
    }

    @Override
    public Optional<User> create(User data) {
        return Optional.empty();
    }

    @Override
    public Optional<User> deleteFromFile(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> writeToFile() {
        return Optional.empty();
    }
}
