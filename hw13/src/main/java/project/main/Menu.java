package project.main;


import project.model.impl.human.Family;
import project.model.impl.human.Human;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;

import static project.util.FamilyUtil.familyController;
import static project.util.FamilyUtil.scanner;
import static project.util.TextUtil.*;

public class Menu {
    public static void showMenu() throws Exception {
        menu();
    }

    public static void menu() throws Exception {
        while (true) {
            System.out.println(menuAppend());
            String selectedItem = scanner.next();
            switch (selectedItem) {
                case "1" -> createFamilyUtil();
                case "2" -> displayAllFamilies();
                case "3" -> getFamiliesBiggerThan();
                case "4" -> getFamiliesLessThan();
                case "5" -> countFamiliesWithMemberNumber();
                case "6" -> createNewFamily();
                case "7" -> deleteFamilyByIndex();
                case "8" -> edit();
                case "9" -> deleteAllChildrenOlderThen();
                case "10" -> loadData();
                case "11" -> saveData();
                case "12" -> System.exit(0);
                default -> System.out.println("Pls enter correct value.");
            }
        }
    }
    public static void saveData() throws IOException {
        familyController.saveData();
    }

    public static void loadData() throws Exception {
        familyController.loadData();
    }

    public static void deleteAllChildrenOlderThen() throws FileNotFoundException {
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        familyController.deleteAllChildrenOlderThen(age);
        System.out.println("Removed.");
    }

    public static void edit() throws Exception {
        System.out.println(forEdit());
        String selectedItemForEdit = scanner.next();
        boolean check = true;
        while (check) {
            switch (selectedItemForEdit) {
                case "1":
                    bornChild();
                    edit();
                    break;
                case "2":
                    adoptChild();
                    edit();
                    break;
                case "3":
                    check = false;
                    showMenu();
                default:
                    System.out.println("Pls enter correct value.");
            }
        }
    }

    public static void bornChild() {
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
    }

    public static void adoptChild() {
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
    }

    public static void deleteFamilyByIndex() throws FileNotFoundException {
        System.out.println("Enter number: ");
        int index = scanner.nextInt();
        familyController.deleteFamilyByIndex(index);
        System.out.println("Deleted.");
    }

    public static void createNewFamily() throws ParseException, FileNotFoundException {
        Human mother = mother();
        Human father = father();
        familyController.createNewFamily(father, mother);
    }

    public static void countFamiliesWithMemberNumber() {
        System.out.println("Enter number: ");
        int numberCount = scanner.nextInt();
        List<Family> families2 = familyController.countFamiliesWithMemberNumber(numberCount);
        families2.forEach(System.out::println);
    }

    public static void getFamiliesLessThan() {
        System.out.println("Enter number: ");
        int numberLess = scanner.nextInt();
        List<Family> families1 = familyController.getFamiliesLessThan(numberLess);
        families1.forEach(family -> System.out.println(family.prettyFormat()));
    }

    public static void getFamiliesBiggerThan() {
        try {
            System.out.println("Enter number: ");
            int numberBig = scanner.nextInt();
            List<Family> families = familyController.getFamiliesBiggerThan(numberBig);
            families.forEach(family -> System.out.println(family.prettyFormat()));
        } catch (Exception exception) {
            System.out.println("Exception");
        }
    }

    public static void displayAllFamilies() {
        familyController.displayAllFamilies();
    }

    public static void createFamilyUtil() throws ParseException, FileNotFoundException {
        Human alisa = new Human("Alisa", "Aliqummatov", "12/02/2001", 15, new HashMap<>());
        Human shirali = new Human("shirali", "Aliqummatov", "11/02/2001", 100, new HashMap<>());
        Human tahmina = new Human("Tahmina", "Muzaffar", "10/02/2001", 99, new HashMap<>());
        Human hunar = new Human("Hunar", "Muzaffar", "11/02/1996", 88, new HashMap<>());
        familyController.createNewFamily(alisa, shirali);
        familyController.createNewFamily(tahmina, hunar);
    }

    public static Human mother() throws ParseException {
        try {
            System.out.println("Enter mother's name: ");
            String motherName = scanner.next();
            System.out.println("Enter mother's last name: ");
            String motherLastName = scanner.next();
            System.out.println("Enter mother's birth year: ");
            int motherBirthYear = scanner.nextInt();
            System.out.println("Enter mother's month of birth: ");
            int motherBirthMonth = scanner.nextInt();
            System.out.println("Enter mother's birthday: ");
            int motherBirthDay = scanner.nextInt();
            System.out.println("Enter mother's iq: ");
            int motherIq = scanner.nextInt();
            String birth = motherBirthDay + "/" + motherBirthMonth + "/" + motherBirthYear;
            return new Human(motherName, motherLastName, birth, motherIq);
        } catch (Exception exception) {
            System.out.println("Pls enter correct value.");
            return new Human();
        }
    }

    public static Human father() throws ParseException {
        try {
            System.out.println("Enter father's name: ");
            String fatherName = scanner.next();
            System.out.println("Enter father's last name: ");
            String fatherLastName = scanner.next();
            System.out.println("Enter father's birth year: ");
            int fatherBirthYear = scanner.nextInt();
            System.out.println("Enter father's month of birth: ");
            int fatherBirthMonth = scanner.nextInt();
            System.out.println("Enter father's birthday: ");
            int fatherBirthDay = scanner.nextInt();
            System.out.println("Enter father's iq: ");
            int fatherIq = scanner.nextInt();
            String birth = fatherBirthDay + "/" + fatherBirthMonth + "/" + fatherBirthYear;
            return new Human(fatherName, fatherLastName, birth, fatherIq);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Pls enter correct value.");
            return new Human();
        }
    }

    public static StringBuilder menuAppend() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(symbol);
        stringBuilder.append(text1);
        stringBuilder.append(text2);
        stringBuilder.append(text3);
        stringBuilder.append(text4);
        stringBuilder.append(text5);
        stringBuilder.append(text6);
        stringBuilder.append(text7);
        stringBuilder.append(text8);
        stringBuilder.append(text9);
        stringBuilder.append(textLoad);
        stringBuilder.append(saveData);
        stringBuilder.append(text10);
        stringBuilder.append(questionText1);
        return stringBuilder;
    }

    public static StringBuilder forEdit() {
        System.out.println(symbol);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text11);
        stringBuilder.append(text12);
        stringBuilder.append(text13);
        stringBuilder.append(questionText2);
        return stringBuilder;
    }
}
