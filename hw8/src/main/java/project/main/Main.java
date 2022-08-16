package project.main;


import project.allEnum.DayOfWeek;
import project.allHuman.Human;
import project.allHuman.Man;
import project.allHuman.Woman;
import project.allPet.DomesticCat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Throwable {
//        humanEnumShow();
        DomesticCat domesticCat = new DomesticCat();
        domesticCat.setNickname("Alisa");
        domesticCat.setAge(2);
        List<String> list = new ArrayList<>();
        list.add("Gym");
        list.add("Swimming");
        domesticCat.setHabits(list);
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
        List<List<String>> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add(DayOfWeek.MONDAY.name());
        list1.add("Go to gym");
        List<String> list2 = new ArrayList<>();
        list2.add(DayOfWeek.WEDNESDAY.name());
        list2.add("Go to sport");
        list.add(list1);
        list.add(list2);
        human.setSchedule(list);
        list.forEach(System.out::println);
    }

    private static void detectFinalize() throws Throwable {
        for (int i = 10000; i < 10000000; i++) {
            Human human = new Human();
        }
    }

}
