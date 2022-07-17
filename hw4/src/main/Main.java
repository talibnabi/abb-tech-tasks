package main;

import alive.Human;
import alive.Pet;

public class Main {
    public static void main(String[] args) {
      /*  Pet pet = new Pet();
        pet.species = "dog";
        pet.nickname = "alisa";
        pet.age = 13;
        pet.trickLevel1 = 90;
        String[] habits = new String[3];
        habits[0] = "swimming";
        habits[1] = "volleyball";
        habits[2] = "football";
        pet.habits = habits;*/
//        System.out.println(pet.toString());
/*        Human father = new Human();
        father.name = "Salami";
        father.surname = "Ghahramani";
        Human mother = new Human();
        mother.name = "Elsa";
        mother.surname = "Ghahramani";
        String[][] schedule = {{"Monday", "go to gym"}};
        Human human = new Human("Teresa", "Ghahramani", 2001, 90, pet, father, mother, schedule);
        System.out.println(human.toString());*/


        /*Human human = new Human();
        Human father = new Human();
        father.name = "Albert";
        father.surname = "Moreno";
        Human mother = new Human();
        mother.name = "Alisa";
        mother.surname = "Moreno";
        String[][] schedule = {{"Monday", "go to gym"}};
        human.name = "Alberto";
        human.surname = "Moreno";
        human.year = 2001;
        human.iq = 99;
        human.pet = pet;
        human.father = father;
        human.mother = mother;
        human.schedule = schedule;
        System.out.println(human.toString());*/


      /*  Human father = new Human();
        father.name = "Ramos";
        father.surname = "Suarez";
        Human mother = new Human();
        mother.name = "Jasmin";
        mother.surname = "Suarez";
        String[][] schedule = {{"Monday", "go to gym"}};
        Human human = new Human("Teresa", "Suarez", 2001, pet, father, mother);
        System.out.println(human.toString());*/


        Pet pet = new Pet();
        pet.species = "dog";
        pet.nickname = "suarez";
        pet.age = 2;
        pet.trickLevel1 = 90;
        String[] habits = new String[3];
        habits[0] = "swimming";
        habits[1] = "volleyball";
        habits[2] = "football";
        pet.habits = habits;
        Human father = new Human();
        father.name = "Simon";
        father.surname = "Alberto";
        Human mother = new Human();
        mother.name = "Alisa";
        mother.surname = "Alberto";
        String[][] schedule = {{"Monday", "go to gym"}, {"Wednesday", "go to swimming"}};
        Human child = new Human("Salman", "Alberto", 2001, 90, pet, father, mother, schedule);
        System.out.println(child.toString());

        boolean b=child.feedPet(true);
        System.out.println(b);
    }
}
