package project.main;


import project.model.enumeration.DayOfWeek;
import project.model.human.Family;
import project.model.human.Human;
import project.model.human.Man;

import java.util.*;


public class Main {
    public static void main(String[] args) throws Throwable {
        Human human = new Man();
        human.setName("Anar");
        human.setSurname("Anar");
        human.setFamily(new Family(new Human(), new Human()));
        human.setIq(23);
        human.setBirthDate("12/2/2001");
        System.out.println(human);
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
