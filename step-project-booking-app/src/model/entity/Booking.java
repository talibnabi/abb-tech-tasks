package model.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Booking implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private static int counter = 0;
    private final int bookingID;
    private final User user;
    private final Flight flight;
    private final Passenger passenger;
    private final LocalDate bookedDate;

    public Booking(User user, Passenger passenger, Flight flight) {
        this.bookingID = counter++;
        this.bookedDate = LocalDate.now();
        this.user = user;
        this.passenger = passenger;
        this.flight = flight;
        this.flight.setPassengers(passenger);
        this.user.setBookingList(this);
    }

    public int getBookingID() {
        return bookingID;
    }

    public User getUser() {
        return user;
    }

    public Passenger getPassenger() {
        return passenger;
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
