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
//        System.out.println(pet.toString());
/*        Human father = new Human();
        father.name = "Salami";
        father.surname = "Ghahramani";
        Human mother = new Human();
        mother.name = "Elsa";
        mother.surname = "Ghahramani";
        String[][] schedule = {{"Monday", "go to gym"}};
        Human human = new Human("Teresa", "Ghahramani", 25, 90, pet, father, mother, schedule);
        System.out.println(human.toString());*/
        
    }
}
