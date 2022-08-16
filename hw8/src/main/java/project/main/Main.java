package project.main;


import project.allEnum.DayOfWeek;
import project.allHuman.Human;
import project.allHuman.Man;
import project.allHuman.Woman;
import project.allPet.DomesticCat;

import javax.print.attribute.HashAttributeSet;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Throwable {
        humanEnumShow();
        DomesticCat domesticCat = new DomesticCat();
        domesticCat.setNickname("Alisa");
        domesticCat.setAge(2);
        Set<String> set = new HashSet<>();
        set.add("Gym");
        set.add("Swimming");
        domesticCat.setHabits(set);
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
        Map<String,String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.MONDAY.name(),"Go to gym");
        schedule.put(DayOfWeek.WEDNESDAY.name(),"Go to sport");
        for (String name: schedule.keySet()) {
            String key = name.toString();
            String value = schedule.get(name).toString();
            System.out.println(key + " " + value);
        }
    }

    private static void detectFinalize() throws Throwable {
        for (int i = 10000; i < 10000000; i++) {
            Human human = new Human();
        }
    }

}
