package project.controller;

import project.exception.FamilyOverflowException;
import project.model.impl.human.Human;
import project.model.inter.Pet;
import project.service.FamilyService;
import project.model.impl.human.Family;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import static project.util.FamilyUtil.checkFamily;

public class FamilyController {
    private final FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    public List<Family> getAllFamilies() {
        return this.familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        this.familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int size) {
        return this.familyService.getFamiliesBiggerThan(size);
    }

    public List<Family> getFamiliesLessThan(int size) {
        return this.familyService.getFamiliesLessThan(size);
    }

    public List<Family> countFamiliesWithMemberNumber(int size) {
        return this.familyService.countFamiliesWithMemberNumber(size);
    }

    public void createNewFamily(Human mother, Human father) throws FileNotFoundException {
        this.familyService.createNewFamily(mother, father);
    }

    public void deleteFamilyByIndex(int index) throws FileNotFoundException {
        this.familyService.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family, String masculine, String feminine) throws ParseException {
        try {
            checkFamily(family);
            return this.familyService.bornChild(family, masculine, feminine);
        } catch (FamilyOverflowException | FileNotFoundException overflowException) {
            System.out.println("Family count is bigger.");
            return family;
        }
    }

    public Family adoptChild(Family family, Human child) {
        try {
            checkFamily(family);
            return this.familyService.adoptChild(family, child);
        } catch (FamilyOverflowException overflowException) {
            System.out.println("Family count is bigger.");
            return family;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAllChildrenOlderThen(int age) throws FileNotFoundException {
        this.familyService.deleteAllChildrenOlderThen(age);
    }

    public int count() {
        return this.familyService.count();
    }

    public Family getFamilyById(int index) {
        return this.familyService.getFamilyById(index);
    }

    public List<Pet> getPets(int index) {
        return this.familyService.getPets(index);
    }

    public void addPet(int index, Pet pet) throws FileNotFoundException {
        this.familyService.addPet(index, pet);
    }

    public void loadData() throws Exception {
        familyService.loadData();
    }
    public void saveData() throws IOException {
        familyService.saveData();
    }
}
