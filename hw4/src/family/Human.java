package family;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private Number year;
    private Integer iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human() {

    }

    public Human(String name, String surname, Number year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, Number year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, Number year, Integer iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        if (iq >= 1 && iq <= 100) {
            this.iq = iq;
        }
        this.pet = pet;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello," + this.getName());
    }

    public void describePet() {
        StringBuilder slyLevel = new StringBuilder("");
        if (this.getPet().getTrickLevel() < 50) {
            slyLevel.append("almost not sly");
        } else if (this.getPet().getTrickLevel() > 50) {
            slyLevel.append("very sly");
        } else {
            slyLevel.append("sly");
        }
        System.out.println("I have a " + this.getPet().getSpecies() + ",he is " + this.getPet().getAge() + " years old,he is" + slyLevel);
    }

    public boolean feedPet(boolean check) {
        Random random = new Random();
        int randomTrickLevel = random.nextInt(100) + 1;
        if (this.getPet().getTrickLevel() != null && this.getPet().getNickname() != null) {
            if (randomTrickLevel > this.getPet().getTrickLevel()) {
                System.out.println("Hm... I will feed " + this.getPet().getNickname());
                check = true;
            } else {
                System.out.println("I think " + this.getPet().getNickname() + " is not hungry.");
                check = false;
            }
        } else {
            System.exit(0);
        }
        return check;
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

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
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
        return getName().equals(human.getName()) && getSurname().equals(human.getSurname()) && getYear().equals(human.getYear()) && getIq().equals(human.getIq()) && getPet().equals(human.getPet()) && getMother().equals(human.getMother()) && getFather().equals(human.getFather()) && Arrays.equals(getSchedule(), human.getSchedule());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getSurname(), getYear(), getIq(), getPet(), getMother(), getFather());
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
                ", pet=" + pet.getSpecies() + pet +
                ", mother=" + mother.getName() + " " + mother.getSurname() +
                ", father=" + father.getName() + " " + father.getSurname() +
                ", schedule=" + scheduleInfo +
                '}';
    }

}
