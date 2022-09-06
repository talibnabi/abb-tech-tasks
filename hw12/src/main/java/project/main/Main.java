package project.main;


import project.controller.FamilyController;
import project.dao.data.CollectionFamilyDao;
import project.model.enumeration.DayOfWeek;
import project.model.human.Family;
import project.model.human.Human;
import project.service.FamilyService;
import project.util.FamilyUtil;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static project.util.FamilyUtil.scanner;


public class Main {
    public static void main(String[] args) throws Throwable {
        selectedMenu();
    }

    private static void selectedMenu() throws ParseException {
        FamilyController familyController = new FamilyController(new FamilyService(new CollectionFamilyDao()));
        while (true) {
            System.out.println(Menu.menu());
            String selectedItem = scanner.next();
            switch (selectedItem) {
                case "1":
                    Human alisa = new Human("Alisa", "Aliqummatov", "12/02/2001", 15, new HashMap<>());
                    Human shirali = new Human("shirali", "Aliqummatov", "11/02/2001", 100, new HashMap<>());

                    Human tahmina = new Human("Tahmina", "Muzaffar", "10/02/2001", 99, new HashMap<>());
                    Human hunar = new Human("Hunar", "Muzaffar", "11/02/1996", 88, new HashMap<>());
                    familyController.createNewFamily(alisa, shirali);
                    familyController.createNewFamily(tahmina, hunar);
                    break;
                case "2":
                    familyController.displayAllFamilies();
                    break;
                case "3":
                    System.out.println("Enter number: ");
                    int numberBig = scanner.nextInt();
                    List<Family> families = familyController.getFamiliesBiggerThan(numberBig);
                    families.forEach(System.out::println);
                    break;
                case "4":
                    System.out.println("Enter number: ");
                    int numberLess = scanner.nextInt();
                    List<Family> families1 = familyController.getFamiliesLessThan(numberLess);
                    families1.forEach(System.out::println);
                    break;
                case "5":
                    
            }
        }
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
