package project;


import project.allHuman.Human;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws Throwable {

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
