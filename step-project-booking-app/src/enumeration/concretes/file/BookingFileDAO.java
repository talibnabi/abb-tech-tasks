package enumeration.concretes.file;

import entity.Booking;
import enumeration.abstracts.FileDAO;
import file.concretes.WorkingWithFile;

import java.util.function.Supplier;

public enum BookingFileDAO implements FileDAO<Booking> {
    BOOKING_FILE_ACCESS(WorkingWithFile::new);

    private final Supplier<WorkingWithFile<Booking>> constructor;

    BookingFileDAO(Supplier<WorkingWithFile<Booking>> constructor) {
        this.constructor = constructor;
    }

    @Override
    public Supplier<WorkingWithFile<Booking>> constructor() {
        return constructor;
    }
}
