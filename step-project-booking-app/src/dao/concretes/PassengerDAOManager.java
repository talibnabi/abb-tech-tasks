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
    public Optional<Passenger> create(Passenger data) {
        return Optional.empty();
    }

    @Override
    public Optional<Passenger> deleteFromFile(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Passenger> writeToFile() {
        return Optional.empty();
    }
}
