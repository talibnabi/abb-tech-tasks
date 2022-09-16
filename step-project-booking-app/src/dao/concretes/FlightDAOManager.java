package dao.concretes;

import dao.abstracts.DAO;
import entity.Flight;

import java.util.Collection;
import java.util.Optional;

public class FlightDAOManager implements DAO<Flight> {
    @Override
    public Optional<Collection<Flight>> getAll() {
        return Optional.empty();
    }

    @Override
    public Optional<Flight> create(Flight data) {
        return Optional.empty();
    }

    @Override
    public Optional<Flight> deleteFromFile(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Flight> writeToFile() {
        return Optional.empty();
    }
}
