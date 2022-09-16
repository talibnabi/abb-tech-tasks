package entity;

import enumeration.concretes.file.FilePathAccess;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import static util.FileUtil.*;

public class Booking implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private final int bookingID = 0;
    private final User user;
    private final Flight flight;
    private List<Passenger> passengers;
    private final LocalDate bookedDate;

    public Booking(User user, List<Passenger> passengers, Flight flight) {
        counterID(FilePathAccess.BOOKING_ID.getFilePath(), bookingID);
        this.bookedDate = LocalDate.now();
        this.user = user;
        if (flight.getAmountOfFreeSeats() > passengers.size()) {
            this.passengers = passengers;
            flight.setAmountOfFreeSeats(flight.getAmountOfFreeSeats() - passengers.size());
        } else {
            flight.setAmountOfFreeSeats(0);
        }
        this.flight = flight;
        this.user.setBookingList(this);
    }

    public int getBookingID() {
        return bookingID;
    }

    public User getUser() {
        return user;
    }

    public List<Passenger> getPassenger() {
        return passengers;
    }

    public Flight getFlight() {
        return flight;
    }

    public LocalDate getBookedDate() {
        return bookedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking booking)) return false;
        return getBookingID() == booking.getBookingID()
                && getUser().equals(booking.getUser())
                && getFlight().equals(booking.getFlight())
                && getPassenger().equals(booking.getPassenger())
                && getBookedDate().equals(booking.getBookedDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookingID(),
                getUser(),
                getFlight(),
                getPassenger(),
                getBookedDate());
    }
}
