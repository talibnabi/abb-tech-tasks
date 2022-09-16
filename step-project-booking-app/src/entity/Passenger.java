package entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Passenger implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private static int counter = 0;
    private final int passengerId;
    private final String name;
    private final String surname;

    public Passenger(String name, String surname) {
        this.passengerId = counter++;
        this.name = name;
        this.surname = surname;
    }

    public int getPassengerId() {
        return passengerId;
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
