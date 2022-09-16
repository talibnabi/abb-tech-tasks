package enumeration.concretes.data;

import entity.Booking;
import entity.Flight;
import enumeration.abstracts.DataSource;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public enum FlightDataSource implements DataSource<Flight> {
    FLIGHT_DATA_SOURCE(LinkedList::new);
    private final Supplier<List<Flight>> constructor;

    FlightDataSource(Supplier<List<Flight>> constructor) {
        this.constructor = constructor;
    }


    @Override
    public Supplier<List<Flight>> constructor() {
        return constructor;
    }
}
