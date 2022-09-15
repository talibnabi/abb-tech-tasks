package model.entity;

import model.enumeration.Airline;
import model.enumeration.Airport;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

import static util.OptionalUtil.dateFormat;

public class Flight implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private static int counter = 0;
    private final int id;
    private final Airline airline;
    private final Airport fromAirport;
    private final Airport toAirport;
    private final LocalDate dateTime;
    private LocalTime time;
    private int amountOfFreeSeats;
    private final List<Passenger> passengers;

    public Flight(
            Airline airline,
            Airport fromAirport, Airport toAirport,
            String dateTime, String time,
            int amountOfFreeSeats
    ) {
        this.id = counter++;
        this.amountOfFreeSeats = amountOfFreeSeats;
        this.airline = airline;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.dateTime = LocalDate.parse(dateTime, dateFormat);
        this.time = LocalTime.parse(time);
        this.passengers = new ArrayList<>();
    }

    public int getId() {
        return id;
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

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger passenger) {
        if (amountOfFreeSeats > passengers.size()) {
            passengers.add(passenger);
            amountOfFreeSeats = amountOfFreeSeats - passengers.size();
        } else {
            amountOfFreeSeats = 0;
        }
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
                && getLocalDate().equals(flight.getLocalDate())
                && getPassengers().equals(flight.getPassengers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getAirline(),
                getFromAirport(),
                getToAirport(),
                getLocalDate(),
                getAmountOfFreeSeats(),
                getPassengers());
    }

    @Override
    public String toString() {
        return String.format("| %s | %s | %s %s | %s ---> %s | %s", id, airline.getIATACode(),
                dateTime, time, fromAirport.getAirportCountry(),
                toAirport.getAirportCountry(), airline.getAirlineName());
    }

//    public static void main(String[] args) {
//        Flight flight = new Flight(
//                Airline.AMERICAN_AIRLINES,
//                Airport.VILNIUS_AIRPORT,
//                Airport.BATNA_AIRPORT,
//                "02/12/2001",
//                "12:11:11", 12);
//        System.out.println(flight.toString());
//    }


}
