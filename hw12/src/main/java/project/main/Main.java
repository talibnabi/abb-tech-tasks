package project.main;


import project.model.enumeration.DayOfWeek;
import project.model.human.Family;
import project.model.human.Human;
import project.model.human.Man;
import project.model.human.Woman;

import java.util.*;


public class Main {
    public static void main(String[] args) throws Throwable {

        Family family = new Family(new Human(), new Human());
        Human human = new Woman();
        human.setName("Alisa");
        human.setSurname("Aslan");
        human.setFamily(new Family(new Human(), new Human()));
        human.setIq(23);
        human.setBirthDate("12/2/2001");
        Human human1 = new Man();
        human1.setName("Amin");
        human1.setSurname("Rahimov");
        human1.setFamily(new Family(new Human(), new Human()));
        human1.setIq(24);
        human1.setBirthDate("12/2/2001");
        family.addChild(human);
        family.setPets(new HashSet<>());
        family.addChild(human1);
        System.out.println(family.prettyFormat());
    }

    private static void humanEnumShow() {
        Human human = new Human();
        Map<String, String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.MONDAY.name(), "Go to gym");
        schedule.put(DayOfWeek.WEDNESDAY.name(), "Go to sport");
        for (String name : schedule.keySet()) {
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
