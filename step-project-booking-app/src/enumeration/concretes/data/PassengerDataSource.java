package enumeration.concretes.data;

import entity.Booking;
import entity.Passenger;
import enumeration.abstracts.DataSource;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public enum PassengerDataSource implements DataSource<Passenger> {
    PASSENGER_DATA_SOURCE(LinkedList::new);
    private final Supplier<List<Passenger>> constructor;

    PassengerDataSource(Supplier<List<Passenger>> constructor) {
        this.constructor = constructor;
    }

    @Override
    public Supplier<List<Passenger>> constructor() {
        return constructor;
    }
}
