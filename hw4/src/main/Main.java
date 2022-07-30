package main;

import alive.Human;
import alive.Pet;

public class Main {
    public static void main(String[] args) {
        petDoIt1();
        petDoIt2();
        petDoIt3();
        humanDoIt1();
        humanDoIt2();
        humanDoIt3();
        humanDoIt4();
        System.out.println();
    }


    private static void petDoIt1() {
        Pet pet = new Pet();
        pet.species = "dog";
        pet.nickname = "alisa";
        pet.age = 13;
        pet.trickLevel1 = 90;
        String[] habits = new String[3];
        habits[0] = "swimming";
        habits[1] = "volleyball";
        habits[2] = "football";
        pet.habits = habits;
        System.out.println(pet.toString());
        pet.eat();
        pet.foul();
        pet.respond();
    }

    private static void petDoIt2() {
        Pet pet = new Pet("dog", "alisa");
        pet.age = 13;
        pet.trickLevel1 = 90;
        String[] habits = new String[3];
        habits[0] = "swimming";
        habits[1] = "volleyball";
        habits[2] = "football";
        pet.habits = habits;
        System.out.println(pet.toString());
        pet.eat();
        pet.foul();
        pet.respond();
    }

    public static void petDoIt3() {
        String[] habits = new String[3];
        habits[0] = "swimming";
        habits[1] = "volleyball";
        habits[2] = "football";
        Pet pet = new Pet("dog", "alisa", 2, 85, habits);
        System.out.println(pet.toString());
        pet.eat();
        pet.foul();
        pet.respond();
    }

    public static void humanDoIt1() {
        Pet pet = new Pet();
        pet.species = "dog";
        pet.nickname = "alisa";
        pet.age = 13;
        pet.trickLevel1 = 90;
        String[] habits = new String[3];
        habits[0] = "swimming";
        habits[1] = "volleyball";
        habits[2] = "football";
        pet.habits = habits;
//        pet.eat();
//        pet.foul();
//        pet.respond();
        Human father = new Human();
        father.name = "Salami";
        father.surname = "Ghahramani";
        Human mother = new Human();
        mother.name = "Elsa";
        mother.surname = "Ghahramani";
        String[][] schedule = {{"Monday", "go to gym"}};
        Human child = new Human("Teresa", "Ghahramani", 2001, 90, pet, father, mother, schedule);
        System.out.println(child.toString());

        boolean check = child.feedPet(true);
        System.out.println(check);
        child.describePet();
        child.greetPet();
    }

    private static void humanDoIt2() {
        Pet pet = new Pet("dog", "alisa");
        pet.age = 13;
        pet.trickLevel1 = 90;
        String[] habits = new String[3];
        habits[0] = "swimming";
        habits[1] = "volleyball";
        habits[2] = "football";
        pet.habits = habits;
//        pet.eat();
//        pet.foul();
//        pet.respond();
        Human child = new Human();
        Human father = new Human();
        father.name = "Albert";
        father.surname = "Moreno";
        Human mother = new Human();
        mother.name = "Alisa";
        mother.surname = "Moreno";
        String[][] schedule = {{"Monday", "go to gym"}};
        child.name = "Alberto";
        child.surname = "Moreno";
        child.year = 2001;
        child.iq = 99;
        child.pet = pet;
        child.father = father;
        child.mother = mother;
        child.schedule = schedule;
        System.out.println(child.toString());
        boolean check = child.feedPet(true);
        System.out.println(check);
        child.describePet();
        child.greetPet();
    }

    private static void humanDoIt3() {
        String[] habits = new String[3];
        habits[0] = "swimming";
        habits[1] = "volleyball";
        habits[2] = "football";
        Pet pet = new Pet("dog", "alisa", 2, 85, habits);
//        pet.eat();
//        pet.foul();
//        pet.respond();
        Human father = new Human();
        father.name = "Ramos";
        father.surname = "Suarez";
        Human mother = new Human();
        mother.name = "Jasmin";
        mother.surname = "Suarez";
        String[][] schedule = {{"Monday", "go to gym"}};
        Human child = new Human("Teresa", "Suarez", 2001, pet, father, mother);
        child.schedule = schedule;
        System.out.println(child.toString());
        boolean check = child.feedPet(true);
        System.out.println(check);
        child.describePet();
        child.greetPet();
    }

    public static void humanDoIt4() {
        String[] habits = new String[3];
        habits[0] = "swimming";
        habits[1] = "volleyball";
        habits[2] = "football";
        Pet pet = new Pet("dog", "alisa", 2, 85, habits);
//        pet.eat();
//        pet.foul();
//        pet.respond();
        Human father = new Human();
        father.name = "Arif";
        father.surname = "Rahibov";
        Human mother = new Human();
        mother.name = "Jasmin";
        mother.surname = "Rahibov";
        String[][] schedule = {{"Monday", "go to gym"}};
        Human child = new Human("Teresa", "Rahibovv", 2001);
        child.pet = pet;
        child.father = father;
        child.mother = mother;
        child.schedule = schedule;
        System.out.println(child.toString());
        boolean check = child.feedPet(true);
        System.out.println(check);
        child.describePet();
        child.greetPet();
    }
}
