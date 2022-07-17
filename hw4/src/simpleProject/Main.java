package simpleProject;

import simpleProject.Pet;

public class Main {
    public static void main(String[] args) {
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
    }
}
