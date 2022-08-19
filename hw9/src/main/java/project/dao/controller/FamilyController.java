package project.dao.controller;

import project.allHuman.Human;
import project.dao.service.FamilyService;
import project.main.Family;

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

    public void createNewFamily(Human mother, Human father) {
        this.familyService.createNewFamily(mother, father);
    }

    public void deleteFamilyByIndex(int index) {
        this.familyService.deleteFamilyByIndex(index);
    }

}
