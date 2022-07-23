package alive;

import family.Family;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private Integer year;
    private Integer iq;
    private Family family;
    private String[][] schedule;// [day of the week] x [type of the activity]


    public Human() {
    }

    public Human(String name, String surname, Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, Integer year, Integer iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, Integer year, Integer iq, Family family, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family = family;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
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
        return getName().equals(human.getName()) && getSurname().equals(human.getSurname()) && getYear().equals(human.getYear()) && getIq().equals(human.getIq()) && getFamily().equals(human.getFamily()) && Arrays.equals(getSchedule(), human.getSchedule());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getSurname(), getYear(), getIq(), getFamily());
        result = 31 * result + Arrays.deepHashCode(getSchedule());
        return result;
    }

    @Override
    public String toString() {
        Integer iqLevel = null;
        if (this.getIq() != null) {
            if (this.getIq() >= 1 && this.getIq() <= 100) {
                iqLevel = this.getIq();
            }
        }
        if (name == null || surname == null) {
            return "no result.";
        } else if (year == null && iq != null && schedule != null) {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", iq=" + iqLevel +
                    ", schedule=" + Arrays.toString(schedule) +
                    '}';
        } else if (iq == null && year != null && schedule != null) {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", schedule=" + Arrays.toString(schedule) +
                    '}';
        } else if (schedule == null && year != null && iq != null) {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", iq=" + iqLevel +
                    '}';
        } else if ((year == null && iq == null) && schedule != null) {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", schedule=" + Arrays.toString(schedule) +
                    '}';
        } else if (schedule == null && year == null && iq != null) {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", iq=" + iqLevel +
                    '}';
        } else {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", iq=" + iqLevel +
                    ", schedule=" + Arrays.toString(schedule) +
                    '}';
        }

    }
}
