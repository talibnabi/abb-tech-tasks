package project.util;

import project.model.human.Human;

import java.text.ParseException;

import static project.util.FamilyUtil.scanner;

public class MenuUtil {
    public static Human mother() throws ParseException {
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
    }

    public static Human father() throws ParseException {
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
    }
}
