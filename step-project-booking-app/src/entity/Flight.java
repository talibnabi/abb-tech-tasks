package entity;

import enumeration.concretes.flight.Airline;
import enumeration.concretes.flight.Airport;
import enumeration.concretes.file.FilePathAccess;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

import static util.FileUtil.*;
import static util.DateUtil.dateFormat;

public class Flight implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private final int flightID = 0;
    private final Airline airline;
    private final Airport fromAirport;
    private final Airport toAirport;
    private final LocalDate dateTime;
    private LocalTime time;
    private int amountOfFreeSeats;

    public Flight(
            Airline airline,
            Airport fromAirport, Airport toAirport,
            String dateTime, String time,
            int amountOfFreeSeats
    ) {
        counterID(FilePathAccess.FLIGHT_ID.getFilePath(), flightID);
        this.amountOfFreeSeats = amountOfFreeSeats;
        this.airline = airline;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.dateTime = LocalDate.parse(dateTime, dateFormat);
        this.time = LocalTime.parse(time);
//        this.passengers = new ArrayList<>();
    }

    public int getId() {
        return flightID;
    }

    public int getAmountOfFreeSeats() {
        return amountOfFreeSeats;
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

    public LocalDate getLocalDate() {
        return dateTime;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = LocalTime.parse(time);
    }

    public void setAmountOfFreeSeats(int amountOfFreeSeats) {
        this.amountOfFreeSeats = amountOfFreeSeats;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight flight)) return false;
        return getId() == flight.getId()
                && getAmountOfFreeSeats() == flight.getAmountOfFreeSeats()
                && getAirline() == flight.getAirline()
                && getFromAirport() == flight.getFromAirport()
                && getToAirport() == flight.getToAirport()
                && getLocalDate().equals(flight.getLocalDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getAirline(),
                getFromAirport(),
                getToAirport(),
                getLocalDate(),
                getAmountOfFreeSeats());
    }

    @Override
    public String toString() {
        return String.format("| %s | %s | %s %s | %s ---> %s | %s", flightID, airline.getIATACode(),
                dateTime, time, fromAirport.getAirportCountry(),
                toAirport.getAirportCountry(), airline.getAirlineName());
    }


}
