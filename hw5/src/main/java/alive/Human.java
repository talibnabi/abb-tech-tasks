package alive;

import family.Family;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private Integer year;
    private Integer iq;
    private String[][] schedule;// [day of the week] x [type of the activity]
    private Family family;

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

    //Advanced complexity
    static {
        System.out.println("Class is being loaded: " + Human.class.getName());
    }

    {
        System.out.println("Object is created: " + getClass().getName());
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


    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        Human human = (Human) object;
        return Objects.equals(name, human.name)
                && Objects.equals(surname, human.surname)
                && Objects.equals(year, human.year)
                && Objects.equals(family.getFather().name, human.getFamily().getFather().getName())
                && Objects.equals(family.getFather().surname, human.getFamily().getFather().getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getYear(), getFamily().getFather().getName(), getFamily().getFather().getSurname());
    }

    @Override
    public String toString() {
        Integer iqLevel = null;
        if (this.iq != null) {
            if (this.iq >= 1 && this.iq <= 100) {
                iqLevel = this.iq;
            }
        } else {
            iq = 0;
        }
        if (name == null || surname == null) {
            return "There is no information.";
        } else if (year == null || year == 0) {
            if (iq == 0 && schedule != null) {
                return "Human{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", schedule=" + Arrays.deepToString(schedule) + '}';
            } else if (schedule == null) {
                if (iq != 0) {
                    return "Human{" +
                            "name='" + name + '\'' +
                            ", surname='" + surname + '\'' +
                            ", iq=" + iq + '}';
                } else {
                    return "Human{" +
                            "name='" + name + '\'' +
                            ", surname='" + surname + '\'' +
                            '}';
                }
            } else {
                return "Human{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", iq=" + iq +
                        ", schedule=" + Arrays.deepToString(schedule) + '}';
            }
        } else if (iq == 0) {
            if (schedule == null) {
                return "Human{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", year=" + year +
                        '}';
            } else {
                return "Human{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", year=" + year +
                        ", schedule=" + Arrays.deepToString(schedule) + '}';
            }

        } else if (schedule == null) {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", iq=" + iq + '}';
        } else {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", iq=" + iq +
                    ", schedule=" + Arrays.deepToString(schedule) + '}';
        }

    }
}


