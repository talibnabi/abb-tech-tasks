package project;


import project.allHuman.Human;
import project.allHuman.Man;
import project.allHuman.Woman;
import project.allPet.DomesticCat;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws Throwable {
        DomesticCat domesticCat = new DomesticCat();
        domesticCat.setNickname("Alisa");
        domesticCat.setAge(2);
        domesticCat.setHabits(new String[]{"Gym", "Swimming"});
        domesticCat.setTrickLevel1(89);
        Man father = new Man("Ramos", "Sergio", 1997);
        father.setIq(99);
        Woman mother = new Woman("Jasmin", "Sergio", 1998);
        mother.setIq(88);
        Family family = new Family(father, mother);
        family.setPet(domesticCat);
        mother.makeup();
        father.repairCar();
        family.bornChild();
        System.out.println(Arrays.toString(family.getChildren()));
    }

    private static void humanEnumShow() {
        Human human = new Human();
        human.setSchedule(new String[][]{{DayOfWeek.MONDAY.name(), "Go to gym"}, {DayOfWeek.WEDNESDAY.name(), "Go to sport"}});
        Arrays.stream(human.getSchedule()).forEach(x -> Arrays.stream(x).forEach(System.out::println));
    }

    private static void detectFinalize() throws Throwable {
        for (int i = 10000; i < 10000000; i++) {
            Human human = new Human();
        }
    }

}
