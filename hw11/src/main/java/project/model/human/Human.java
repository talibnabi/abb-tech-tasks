package project.model.human;

import project.model.pet.Pet;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

import static project.util.FamilyUtil.sdf;

public class Human {
    private String name;
    private String surname;
    private long birthDate;
    private Integer iq;
    private Map<String, String> schedule;// [day of the week] x [type of the activity]
    private Family family;
    private Pet pet;



    public Human() {
    }

    public Human(String name, String surname, String birthDate) throws ParseException {
        this.name = name;
        this.surname = surname;
        Date date = sdf.parse(birthDate);
        this.birthDate = date.getTime();
    }

    public Human(String name, String surname, String birthDate, Integer iq) throws ParseException {
        this.name = name;
        this.surname = surname;
        Date date = sdf.parse(birthDate);
        this.birthDate = date.getTime();
        this.iq = iq;
    }


    public Human(String name, String surname, String birthDate, Integer iq, Map<String, String> schedule) throws ParseException {
        this.name = name;
        this.surname = surname;
        Date date = sdf.parse(birthDate);
        this.birthDate = date.getTime();
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

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
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

    public String describeAge() {
        StringBuilder stringBuilder = new StringBuilder();
        Calendar cal = Calendar.getInstance();
        long birthDateSecond = cal.getTimeInMillis() - this.birthDate;
        cal.setTimeInMillis(birthDateSecond);
        int year = cal.get(Calendar.YEAR) - 1970;
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH) - 1;
        stringBuilder.append(year);
        stringBuilder.append("-year. ");
        stringBuilder.append(month);
        stringBuilder.append("-month. ");
        stringBuilder.append(day);
        stringBuilder.append("-day. ");
        return stringBuilder.toString();
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
                && Objects.equals(birthDate, human.birthDate)
                && Objects.equals(family.getFather().name, human.getFamily().getFather().getName())
                && Objects.equals(family.getFather().surname, human.getFamily().getFather().getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getBirthDate(), getFamily().getFather().getName(), getFamily().getFather().getSurname());
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
        if (birthDate != 0) stringBuilder.append(", year=").append(birthDate);
        stringBuilder.append(", iq=").append(iqLevel);
        if (schedule != null) stringBuilder.append(", schedule=").append(schedule.toString());
        stringBuilder.append('}');

        return stringBuilder.toString();
    }
}


