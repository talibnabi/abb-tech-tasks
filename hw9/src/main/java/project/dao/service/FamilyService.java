package project.dao.service;

import project.dao.data.CollectionFamilyDao;
import project.dao.inter.FamilyDao;
import project.main.Family;

import java.util.ArrayList;
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
    
}
