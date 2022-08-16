package project.allHuman;

import project.main.Family;
import project.allPet.Pet;
import java.util.Map;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private Integer year;
    private Integer iq;
    private Map<String,String> schedule;// [day of the week] x [type of the activity]
    private Family family;
    private Pet pet;


    public Human() {
    }

    public Human(String name, String surname, Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public Human(String name, String surname, Integer year, Integer iq, Map<String,String> schedule ) {
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


    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet() {
        System.out.println("Hello," + this.pet.getNickname());
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

    protected void finalize() throws Throwable {
        System.out.println("Inside finalize method of " + getClass().getName() + " Class");
        System.out.println("Calling finalize method of the Object class");
        // Calling finalize() of Object class
        super.finalize();
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName().substring(getClass().getName().lastIndexOf('.') + 1));
        stringBuilder.append('{');

        if (name == null) return stringBuilder.append('}').toString();
        else stringBuilder.append("name='").append(name).append('\'');

        if (surname != null) stringBuilder.append(", surname='").append(surname).append('\'');
        if (year != null) stringBuilder.append(", year=").append(year);
        if (iq != null) stringBuilder.append(", iq=").append(iqLevel);
        if (schedule != null) stringBuilder.append(", schedule=").append(schedule.toString());
        stringBuilder.append('}');

        return stringBuilder.toString();
    }
}


