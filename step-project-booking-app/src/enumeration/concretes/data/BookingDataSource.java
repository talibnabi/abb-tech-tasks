package enumeration.concretes.data;

import entity.Booking;
import enumeration.abstracts.DataSource;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public enum BookingDataSource implements DataSource<Booking> {
    BOOKING_DATA_SOURCE(LinkedList::new);

    private final Supplier<List<Booking>> constructor;

    BookingDataSource(Supplier<List<Booking>> constructor) {
        this.constructor = constructor;
    }

    @Override
    public Supplier<List<Booking>> constructor() {
        return constructor;
    }
}
