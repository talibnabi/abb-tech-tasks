package project.main;


import project.model.human.Family;
import project.model.human.Human;

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
                    System.out.println(Menu.forEdit());
                    String selectedItemForEdit = scanner.next();
                    boolean check = true;
                    while (check) {
                        switch (selectedItemForEdit) {
                            case "1":
                                try {
                                    System.out.println("Enter id: ");
                                    int id = scanner.nextInt();
                                    Family familyById = familyController.getFamilyById(id);
                                    System.out.println("Enter boy name: ");
                                    String boy = scanner.next();
                                    System.out.println("Enter girl name: ");
                                    String girl = scanner.next();
                                    familyController.bornChild(familyById, boy, girl);
                                } catch (Exception exception) {
                                    System.out.println("Pls enter correct value");
                                }
                                break;
                            case "2":
                                try {
                                    System.out.println("Enter id: ");
                                    int id = scanner.nextInt();
                                    Family familyById = familyController.getFamilyById(id);
                                    System.out.println("Enter name: ");
                                    String name = scanner.next();
                                    System.out.println("Enter surname: ");
                                    String surname = scanner.next();
                                    System.out.println("Enter birth. (dd/MM/yyy): ");
                                    String birth = scanner.next();
                                    System.out.println("Enter iq: ");
                                    int iq = scanner.nextInt();
                                    Human human = new Human(name, surname, birth, iq);
                                    familyController.adoptChild(familyById, human);
                                } catch (Exception exception) {
                                    System.out.println("Pls enter correct value");
                                }
                                break;
                            case "3":
                                check = false;
                                showMenu();
                            default:
                                System.out.println("Pls enter correct value.");
                        }
                    }
                case "9":
                    System.out.println("Enter age: ");
                    int age = scanner.nextInt();
                    familyController.deleteAllChildrenOlderThen(age);
                    System.out.println("Removed.");
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
