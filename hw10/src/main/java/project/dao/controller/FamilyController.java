package project.dao.controller;

import project.allHuman.*;
import project.allPet.Pet;
import project.dao.service.FamilyService;
import project.main.Family;

import java.text.ParseException;
import java.util.List;

import static project.util.FamilyUtil.date;
import static project.util.FamilyUtil.random;

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

    public void createNewFamily(Human mother, Human father) {
        this.familyService.createNewFamily(mother, father);
    }

    public void deleteFamilyByIndex(int index) {
        this.familyService.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family, String masculine, String feminine) throws ParseException {
        return this.familyService.bornChild(family, masculine, feminine);
    }

    public Family adoptChild(Family family, Human child) {
        return this.familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThen(int age) {
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

    public void addPet(int index, Pet pet) {
        this.familyService.addPet(index, pet);
    }
}
