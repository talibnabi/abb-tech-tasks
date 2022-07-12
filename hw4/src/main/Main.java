package main;

import family.Human;
import family.Pet;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("dog", null, 2, 54, new String[]{"sleeping,eating"});
        Human father = new Human("Ramos", "Hernandez", 1979);
        Human mother = new Human("Alexandra", "Hernandez", 1976);
        String[][] schedule = {{"Monday", "Go to gym"}, {"Tuesday", "Go to swimming"}};
        Human child = new Human("Georgia", "Hernandez", 2001, 95, pet, father, mother, schedule);
        boolean b=child.feedPet(true);
        System.out.println(b);

    }
}
