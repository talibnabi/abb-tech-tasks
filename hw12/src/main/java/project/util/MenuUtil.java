package project.util;

import project.model.human.Family;
import project.model.human.Human;

import java.text.ParseException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;

import static project.util.FamilyUtil.familyController;
import static project.util.FamilyUtil.scanner;

public class MenuUtil {
    public static void deleteFamilyByIndex() {
        System.out.println("Enter number: ");
        int index = scanner.nextInt();
        familyController.deleteFamilyByIndex(index);
        System.out.println("Deleted.");
    }

    public static void createNewFamily() throws ParseException {
        Human mother = mother();
        Human father = father();
        familyController.createNewFamily(mother, father);
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
        families1.forEach(System.out::println);
    }

    public static void getFamiliesBiggerThan() {
        System.out.println("Enter number: ");
        int numberBig = scanner.nextInt();
        List<Family> families = familyController.getFamiliesBiggerThan(numberBig);
        families.forEach(System.out::println);
    }

    public static void displayAllFamilies() {
        familyController.displayAllFamilies();
    }

    public static void createFamilyUtil() throws ParseException {
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
            String birth = String.valueOf(motherBirthDay) + "/" + String.valueOf(motherBirthMonth) + "/" + String.valueOf(motherBirthYear);
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
            String birth = String.valueOf(fatherBirthDay) + "/" + String.valueOf(fatherBirthMonth) + "/" + String.valueOf(fatherBirthYear);
            return new Human(fatherName, fatherLastName, birth, fatherIq);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Pls enter correct value.");
            return new Human();
        }
    }
}
