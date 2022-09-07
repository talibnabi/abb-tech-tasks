package project.dao.service;

import org.testng.annotations.Test;
import project.model.human.Human;
import project.model.pet.Pet;
import project.dao.data.CollectionFamilyDao;
import project.model.human.Family;
import project.service.FamilyService;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;

public class FamilyServiceTest {
    private static final FamilyService familyService = new FamilyService(new CollectionFamilyDao());

    @Test
    void getAllFamiliesTest() throws FileNotFoundException {
        Human mother = new Human();
        Human father = new Human();
        familyService.createNewFamily(mother, father);
        List<Family> families = familyService.getAllFamilies();
        families.forEach(System.out::println);
    }

    @Test
    void displayAllFamiliesTest() {
        familyService.displayAllFamilies();
    }

    @Test
    void getFamiliesBiggerThanTest() {
        List<Family> families = familyService.getFamiliesBiggerThan(0);
        families.forEach(System.out::println);
    }

    @Test
    void getFamiliesLessThanTest() {
        List<Family> families = familyService.getFamiliesLessThan(0);
        families.forEach(System.out::println);
    }

    @Test
    void countFamiliesWithMemberNumberTest() {
        List<Family> families = familyService.countFamiliesWithMemberNumber(0);
        families.forEach(System.out::println);
    }

    @Test
    void createNewFamilyTest() throws FileNotFoundException {
        Human mother = new Human();
        Human father = new Human();
        familyService.createNewFamily(mother, father);
    }

    @Test
    void deleteFamilyByIndexTest() throws FileNotFoundException {
        FamilyService familyService = new FamilyService(new CollectionFamilyDao());
        Human mother = new Human();
        Human father = new Human();
        familyService.createNewFamily(mother, father);
        familyService.deleteFamilyByIndex(0);
    }

    @Test
    void bornChildTest() throws FileNotFoundException, ParseException {
        Human mother = new Human();
        mother.setIq(10);
        Human father = new Human();
        father.setIq(42);
        Family family = new Family(mother, father);
        familyService.bornChild(family, "Alis", "Alisa");
    }

    @Test
    void adoptChildTest() throws FileNotFoundException {
        Human mother = new Human();
        Human father = new Human();
        Human child = new Human();
        Family family = new Family(mother, father);
        familyService.adoptChild(family, child);
    }

    @Test
    void deleteAllChildrenOlderThenTest() throws FileNotFoundException {
        familyService.deleteAllChildrenOlderThen(32);
    }

    @Test
    void countTest() {
        int count = familyService.count();
        System.out.println(count);
    }

    @Test
    void getFamilyByIdTest() throws FileNotFoundException {
        Human father = new Human();
        Human mother = new Human();
        familyService.createNewFamily(mother, father);
        Family family = familyService.getFamilyById(0);
        System.out.println(family);
    }

    @Test
    void getPetsTest() throws FileNotFoundException {
        Human father = new Human();
        Human mother = new Human();
        familyService.createNewFamily(mother, father);
        List<Pet> petList = familyService.getPets(0);
        petList.forEach(System.out::println);
    }
}
