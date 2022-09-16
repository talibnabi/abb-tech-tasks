package dao.concretes;

import dao.abstracts.DAO;
import entity.Passenger;

import java.util.Collection;
import java.util.Optional;

public class PassengerDAOManager implements DAO<Passenger> {
    @Override
    public Optional<Collection<Passenger>> getAll() {
        return Optional.empty();
    }

    @Override
    public Boolean create(Passenger data) {
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
