package enumeration.concretes.file;

import entity.Booking;
import entity.Flight;
import enumeration.abstracts.FileDAO;
import file.concretes.WorkingWithFile;

import java.util.function.Supplier;

public enum FlightFileDAO implements FileDAO<Flight> {
    FLIGHT_FILE_ACCESS(WorkingWithFile::new);

    private final Supplier<WorkingWithFile<Flight>> constructor;

    FlightFileDAO(Supplier<WorkingWithFile<Flight>> constructor) {
        this.constructor = constructor;
    }

    @Override
    public Supplier<WorkingWithFile<Flight>> constructor() {
        return constructor;
    }
}
