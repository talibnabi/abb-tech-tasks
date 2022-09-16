package entity;


import enumeration.concretes.file.FilePathAccess;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

import static util.FileUtil.*;

public class Passenger implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final int passengerID = 0;
    private final String name;
    private final String surname;

    public Passenger(String name, String surname) {
        counterID(FilePathAccess.PASSENGER_ID.getFilePath(), passengerID);
        this.name = name;
        this.surname = surname;
    }

    public int getPassengerId() {
        return passengerID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passenger passenger)) return false;
        return getName().equals(passenger.getName()) && getSurname().equals(passenger.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
