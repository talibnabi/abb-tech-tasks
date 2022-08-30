package project.dao.service;

import org.testng.annotations.Test;
import project.allHuman.Human;
import project.dao.data.CollectionFamilyDao;
import project.main.Family;

import java.util.List;

public class FamilyServiceTest {
    @Test
    void getAllFamiliesTest() {
        FamilyService familyService = new FamilyService(new CollectionFamilyDao());
        Human mother = new Human();
        Human father = new Human();
        familyService.createNewFamily(mother, father);
        List<Family> families = familyService.getAllFamilies();
        families.forEach(System.out::println);
    }

    @Test
    void displayAllFamiliesTest() {
        FamilyService familyService = new FamilyService(new CollectionFamilyDao());
        familyService.displayAllFamilies();
    }

    @Test
    void getFamiliesBiggerThanTest() {
        FamilyService familyService = new FamilyService(new CollectionFamilyDao());
        List<Family> families = familyService.getFamiliesBiggerThan(0);
        families.forEach(System.out::println);
    }

    @Test
    void getFamiliesLessThanTest() {
        FamilyService familyService = new FamilyService(new CollectionFamilyDao());
        List<Family> families = familyService.getFamiliesLessThan(0);
        families.forEach(System.out::println);
    }

    @Test
    void countFamiliesWithMemberNumberTest() {
        FamilyService familyService = new FamilyService(new CollectionFamilyDao());
        List<Family> families = familyService.countFamiliesWithMemberNumber(0);
        families.forEach(System.out::println);
    }

    @Test
    void createNewFamilyTest() {
        FamilyService familyService = new FamilyService(new CollectionFamilyDao());
        Human mother = new Human();
        Human father = new Human();
        familyService.createNewFamily(mother, father);
    }

    @Test
    void deleteFamilyByIndexTest() {
        FamilyService familyService = new FamilyService(new CollectionFamilyDao());
        Human mother = new Human();
        Human father = new Human();
        familyService.createNewFamily(mother, father);
        familyService.deleteFamilyByIndex(0);
    }

    @Test
    void bornChildTest() {

    }

    @Test
    void adoptChildTest() {

    }

    @Test
    void deleteAllChildrenOlderThenTest() {

    }

    @Test
    void countTest() {

    }

    @Test
    void getFamilyByIdTest() {

    }

    @Test
    void getPetsTest() {

    }
}
