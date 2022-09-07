package project.controller;

import project.model.human.Human;
import project.model.pet.Pet;
import project.service.FamilyService;
import project.model.human.Family;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;

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

    public void bornChild(Family family, String masculine, String feminine) throws ParseException, FileNotFoundException {
        this.familyService.bornChild(family, masculine, feminine);
    }

    public void adoptChild(Family family, Human child) throws FileNotFoundException {
        this.familyService.adoptChild(family, child);
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
}
