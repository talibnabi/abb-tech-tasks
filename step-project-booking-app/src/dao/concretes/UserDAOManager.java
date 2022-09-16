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
    public Boolean create(User data) {
        return true;
    }

    @Override
    public Boolean deleteFromFile(int id) {
        return true;
    }

    @Override
    public Boolean writeToFile() {
        return true;
    }
}
