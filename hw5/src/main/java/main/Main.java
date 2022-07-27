package main;


import alive.Human;
import alive.Pet;
import family.Family;

public class Main {
    public static void main(String[] args) {
//        Human human = new Human();
//        human.setName("talib");
//        human.setSurname("nabi");
//        human.setSchedule(new String[][]{{"monday"}, {"go to gym"}});
//        human.setYear(200);
//        System.out.println(human);
        Human mother = new Human();
        mother.setName("Alisa");
        Human father = new Human();
        father.setName("Gonzales");
//        Pet pet=new Pet();
//        pet.setNickname("alisa2");
//        pet.setHabits(new String[]{"bit"});
//        pet.setSpecies("asd");
        Family family = new Family(mother, father);
        Human child = new Human();
        child.setName("talib");
        child.setSurname("nabi");
        child.setSchedule(new String[][]{{"monday"}, {"go to gym"}});
        child.setYear(200);

        Human child2 = new Human();
        child2.setName("nami1");
        child2.setSurname("aghayev");
        child2.setSchedule(new String[][]{{"tuesday"}, {"go to gym"}});
        child2.setYear(200);
        family.addChild(child);
        family.addChild(child2);
        family.deleteChild(1);
        System.out.println(family);
        System.out.println(family.countFamily());
//        boolean b=family.deleteChild(1);
//        System.out.println(b);
//        family.setPet(pet);
//        System.out.println(family);

    }
}
