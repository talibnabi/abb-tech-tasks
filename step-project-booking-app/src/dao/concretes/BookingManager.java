package dao.concretes;

import dao.abstracts.DAO;
import entity.Booking;

import java.util.Collection;
import java.util.Optional;

public class BookingManager implements DAO<Booking> {


    @Override
    public Optional<Collection<Booking>> getAll() {
        return Optional.empty();
    }

    @Override
    public Optional<Booking> create(Booking data) {
        return Optional.empty();
    }

    @Override
    public Optional<Booking> deleteFromFile(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Booking> writeToFile() {
        return Optional.empty();
    }
}
