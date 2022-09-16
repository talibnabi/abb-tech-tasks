package dao.concretes;

import dao.abstracts.DAO;
import entity.Flight;

import javax.swing.text.StyledEditorKit;
import java.util.Collection;
import java.util.Optional;

public class FlightDAOManager implements DAO<Flight> {
    @Override
    public Optional<Collection<Flight>> getAll() {
        return Optional.empty();
    }

    @Override
    public Boolean create(Flight data) {
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
