package model.entity;

import model.enumeration.Airline;
import model.enumeration.Airport;

import java.io.Serial;
import java.io.Serializable;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static util.OptionalUtil.dateFormat;
import static util.OptionalUtil.sdf;

public class Flight implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private final int id;
    private final Airline airline;
    private final Airport fromAirport;
    private final Airport toAirport;
    private final LocalDateTime dateTime;
    private Date time = null;
    private int amountOfFreeSeats;
    private final List<Passenger> passengers;

    public Flight(int id, Airline airline, Airport fromAirport, Airport toAirport, String dateTime, String time, int amountOfFreeSeats) {
        this.id = id;
        this.amountOfFreeSeats = amountOfFreeSeats;
        this.airline = airline;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.dateTime = LocalDateTime.from(LocalDate.parse(dateTime, dateFormat));
        try {
            this.time = sdf.parse(time);
        } catch (ParseException e) {
            System.out.println("Parse Exception.Please try again");
        }
        this.passengers = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getAmountOfFreeSeats() {
        return amountOfFreeSeats--;
    }

    public Airline getAirline() {
        return airline;
    }

    public Airport getFromAirport() {
        return fromAirport;
    }

    public Airport getToAirport() {
        return toAirport;
    }

    public LocalDateTime getLocalDateTime() {
        return dateTime;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(String time) {
        try {
            this.time = sdf.parse(time);
        } catch (ParseException e) {
            System.out.println("Parse Exception.Please try again");
        }
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger passenger) {
        this.passengers.add(passenger);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight flight)) return false;
        return getId() == flight.getId() && getAmountOfFreeSeats() == flight.getAmountOfFreeSeats() && getAirline() == flight.getAirline() && getFromAirport() == flight.getFromAirport() && getToAirport() == flight.getToAirport() && getLocalDateTime().equals(flight.getLocalDateTime()) && getPassengers().equals(flight.getPassengers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAirline(), getFromAirport(), getToAirport(), getLocalDateTime(), getAmountOfFreeSeats(), getPassengers());
    }
}
