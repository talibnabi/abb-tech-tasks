package project.main;


import java.text.ParseException;


import static project.util.FamilyUtil.familyController;
import static project.util.FamilyUtil.scanner;
import static project.util.MenuUtil.*;


public class Main {
    public static void main(String[] args) throws Throwable {
        showMenu();
    }

    private static void showMenu() throws ParseException {
        while (true) {
            System.out.println(Menu.menu());
            String selectedItem = scanner.next();
            switch (selectedItem) {
                case "1":
                    createFamilyUtil();
                    break;
                case "2":
                    displayAllFamilies();
                    break;
                case "3":
                    getFamiliesBiggerThan();
                    break;
                case "4":
                    getFamiliesLessThan();
                    break;
                case "5":
                    countFamiliesWithMemberNumber();
                    break;
                case "6":
                    createNewFamily();
                    break;
                case "7":
                    deleteFamilyByIndex();
                    break;
                case "8":

                    break;
                case "9":

                    break;
                case "10":
                    System.exit(0);
                default:
                    System.out.println("Pls enter correct value.");
            }
        }
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
