package alive;

import java.util.Arrays;
import java.util.Random;

public class Human {
    public String name;
    public String surname;
    public Integer year;
    public Integer iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;// [day of the week] x [type of the activity]

    public Human() {
    }

    public Human(String name, String surname, Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, Integer year, Pet pet, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, Integer year, Integer iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello," + this.pet.nickname);
    }

    public void describePet() {
        StringBuilder slyLevel = new StringBuilder("");
        if (this.pet.trickLevel1 > 50) {
            slyLevel.append("very sly");
        } else if (this.pet.trickLevel1 < 50) {
            slyLevel.append("almost not sly");
        } else {
            slyLevel.append("sly");
        }
        System.out.println("I have a " + this.pet.species + ",he is " + this.pet.age + " years old,he is " + slyLevel);
    }

    //advanced complexity
    public boolean feedPet(boolean check) {
        Random random = new Random();
        int randomTrickLevel = random.nextInt(100) + 1;
        if (this.pet.trickLevel1 != null && this.pet.nickname != null) {
            if (randomTrickLevel > this.pet.trickLevel1) {
                System.out.println("Hm... I will feed " + this.pet.nickname);
                check = true;
            } else {
                System.out.println("I think " + this.pet.nickname + " is not hungry.");
                check = false;
            }
        } else {
            return false;
        }
        return check;
    }

    @Override
    public String toString() {
        Integer iqLevel = null;
        if (this.iq != null) {
            if (this.iq >= 1 && this.iq <= 100) {
                iqLevel = this.iq;
            }
        }
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iqLevel + ", " +
                this.pet.species + "{" +
                "nickname='" + this.pet.nickname + '\'' +
                ", age=" + this.pet.age +
                ", trickLevel1=" + this.pet.trickLevel1 +
                ", habits=" + Arrays.toString(this.pet.habits) +
                '}' +
                ", mother=" + father.name + " " + father.surname +
                ", father=" + mother.name + " " + mother.surname + "}";
    }
}
