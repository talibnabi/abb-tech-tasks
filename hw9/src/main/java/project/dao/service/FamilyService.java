package project.dao.service;

import project.allHuman.Human;
import project.dao.data.CollectionFamilyDao;
import project.dao.inter.FamilyDao;
import project.main.Family;

import java.util.List;

public class FamilyService {
    private final FamilyDao familyDao;

    public FamilyService(CollectionFamilyDao collectionFamilyDao) {
        this.familyDao = collectionFamilyDao;
    }

    public List<Family> getAllFamilies() {
        return this.familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        this.familyDao
                .getAllFamilies()
                .forEach(family ->
                        System.out.printf("%d %s \n", getAllFamilies()
                                .indexOf(family), family));
    }

    public List<Family> getFamiliesBiggerThan(int size) {
        List<Family> familiesBiggerThan = this.familyDao
                .getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() > size)
                .toList();
        System.out.println(familiesBiggerThan);
        return familiesBiggerThan;
    }

    public List<Family> getFamiliesLessThan(int size) {
        List<Family> familiesLessThan = this.familyDao
                .getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() < size)
                .toList();
        System.out.println(familiesLessThan);
        return familiesLessThan;
    }

    public List<Family> countFamiliesWithMemberNumber(int size) {
        List<Family> familiesLessThan = this.familyDao
                .getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() == size)
                .toList();
        System.out.println(familiesLessThan);
        return familiesLessThan;
    }

    public void createNewFamily(Human mother, Human father) {
        Family family = new Family(mother, father);
        this.familyDao.saveFamily(family);
    }
    
}
