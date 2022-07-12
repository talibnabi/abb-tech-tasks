package alive;

import family.Family;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private Number year;
    private Integer iq;

    private Pet pet;
    private String[][] schedule;

    private Family family;

    public Human() {

    }

    public Human(String name, String surname, Number year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public Human(String name, String surname, Number year, Integer iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        if (iq >= 1 && iq <= 100) {
            this.iq = iq;
        }
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Number getYear() {
        return year;
    }

    public void setYear(Number year) {
        this.year = year;
    }

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        if (iq >= 1 && iq <= 100) {
            this.iq = iq;
        }
    }

    public Pet getPet() {
        return pet;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return getName().equals(human.getName()) && getSurname().equals(human.getSurname()) && getYear().equals(human.getYear()) && getIq().equals(human.getIq()) && getPet().equals(human.getPet()) && Arrays.equals(getSchedule(), human.getSchedule()) && getFamily().equals(human.getFamily());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getSurname(), getYear(), getIq(), getPet(), getFamily());
        result = 31 * result + Arrays.deepHashCode(getSchedule());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder scheduleInfo = new StringBuilder(" ");
        if (this.getSchedule() != null) {
            for (int i = 0; i < this.getSchedule().length; i++) {
                scheduleInfo.append(this.getSchedule()[i][0]).append("-->").append(this.getSchedule()[i][1]).append(".");
            }
        } else {
            scheduleInfo.append("");
        }
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + scheduleInfo +
                '}';
    }
}
