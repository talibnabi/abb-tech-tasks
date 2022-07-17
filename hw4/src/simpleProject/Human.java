package simpleProject;

import java.util.Arrays;

public class Human {
    String name;
    String surname;
    Integer year;
    Integer iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;// [day of the week] x [type of the activity]

    Human() {
    }

    Human(String name, String surname, Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    Human(String name, String surname, Integer year, Pet pet, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
    }

    Human(String name, String surname, Integer year, Integer iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
    }

    void greetPet() {
        System.out.println("Hello," + this.pet.nickname);
    }

    void describePet() {
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
                ", mother=" + mother.name + " " + mother.surname +
                ", father=" + father.name + " " + mother.surname +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
