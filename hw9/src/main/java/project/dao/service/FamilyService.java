package project.dao.service;

import project.allHuman.*;
import project.allPet.Pet;
import project.dao.data.CollectionFamilyDao;
import project.dao.inter.FamilyDao;
import project.main.Family;

import java.util.List;

import static project.util.FamilyUtil.date;
import static project.util.FamilyUtil.random;

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

    public void deleteFamilyByIndex(int index) {
        this.familyDao.deleteFamily(index);
    }

    public Family bornChild(Family family, String masculine, String feminine) {
        int randomNumForSex = random.nextInt(2) + 1;
        int randomNum = random.nextInt(100) + 1;
        int iq = (family.getMother().getIq() + family.getFather().getIq()) / 2;
        if ((randomNumForSex == 1 && randomNum == 50) || randomNum > 50) {
            AllWomanName allWomanName = new AllWomanName();
            Woman woman = new Woman(feminine, family.getFather().getSurname(), null, iq, null);
            family.addChild(woman);
        } else {
            AllManName allManName = new AllManName();
            Man man = new Man(masculine, family.getFather().getSurname(), null, iq, null);
            family.addChild(man);
        }
        return this.familyDao.saveFamily(family);
    }

    public Family adoptChild(Family family, Human child) {
        family.addChild(child);
        return this.familyDao.saveFamily(family);
    }

    public void deleteAllChildrenOlderThen(int age) {
        int currentYear = date.getYear() + 1900;
        for (Family family : this.familyDao
                .getAllFamilies()
                .stream()
                .filter(family ->
                        family
                                .getChildren()
                                .removeIf(human -> (currentYear - human.getYear()) > age))
                .toList()) {
            this.familyDao.saveFamily(family);
        }
    }

    public int count() {
        return this.familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        return this.familyDao.getAllFamilies().get(index);
    }

    public List<Pet> getPets(int index) {
        return this.familyDao.getAllFamilies().get(index).getPets().stream().toList();
    }

    public void addPet(int index, Pet pet) {
        this.familyDao.getAllFamilies().get(index).getPets().add(pet);
        this.familyDao.saveFamily(this.familyDao.getAllFamilies().get(index));
    }
}
