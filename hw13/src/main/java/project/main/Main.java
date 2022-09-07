package project.main;


import project.model.enumeration.Species;
import project.model.human.Family;
import project.model.human.Human;
import project.model.pet.Dog;
import project.model.pet.Pet;

import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static project.main.Menu.*;


public class Main {
    public static void main(String[] args) throws Throwable {
        showMenu();
//        prettyExample();
    }

    private static void prettyExample() throws ParseException {
        Human tahmina = new Human("Tahmina", "Muzaffar", "10/02/2001", 99, new HashMap<>());
        Human alisa = new Human("Alisa", "Aliqummatov", "12/02/2001", 15, new HashMap<>());
        Pet pet = new Dog();
        pet.setNickname("x man");
        pet.setAge(19);
        pet.setHabits(new HashSet<>());
        pet.setTrickLevel1(23);
        pet.setSpecies(Species.DOG);
        Set<Pet> pets = new HashSet<>();
        pets.add(pet);
        Family family = new Family(tahmina, alisa);
        family.setPets(pets);
        System.out.println(family.prettyFormat());
    }


//    private static void humanEnumShow() {
//        Human human = new Human();
//        Map<String, String> schedule = new HashMap<>();
//        schedule.put(DayOfWeek.MONDAY.name(), "Go to gym");
//        schedule.put(DayOfWeek.WEDNESDAY.name(), "Go to sport");
//        for (String name : schedule.keySet()) {
//            String key = name.toString();
//            String value = schedule.get(name).toString();
//            System.out.println(key + " " + value);
//        }
//    }
//
//
//    private static void detectFinalize() throws Throwable {
//        for (int i = 10000; i < 10000000; i++) {
//            Human human = new Human();
//        }
//    }

}
