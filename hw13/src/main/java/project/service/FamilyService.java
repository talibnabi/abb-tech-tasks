package project.service;

import project.model.impl.human.*;
import project.model.inter.Pet;
import project.dao.data.CollectionFamilyDao;
import project.dao.inter.FamilyDao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.List;

//import static project.db.write.WriteFamilyToFile.writeFamilyToFile;
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
                        System.out.printf("%d %s \n",
                                getAllFamilies().indexOf(family) + 1, family.prettyFormat()));
    }

    public List<Family> getFamiliesBiggerThan(int size) {
        return this.familyDao
                .getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() > size)
                .toList();
    }

    public List<Family> getFamiliesLessThan(int size) {
        return this.familyDao
                .getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() < size)
                .toList();
    }

    public List<Family> countFamiliesWithMemberNumber(int size) {
        return this.familyDao
                .getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() == size)
                .toList();
    }

    public void createNewFamily(Human mother, Human father) throws FileNotFoundException {
        Family family = new Family(mother, father);
        family.setPets(new HashSet<>());
        this.familyDao.saveFamily(family);
    }

    public void deleteFamilyByIndex(int index) throws FileNotFoundException {
        this.familyDao.deleteFamily(index);
    }

    public Family bornChild(Family family, String masculine, String feminine) throws ParseException, FileNotFoundException {
        int randomNumForSex = random.nextInt(2) + 1;
        int randomNum = random.nextInt(100) + 1;
        int iq = (family.getMother().getIq() + family.getFather().getIq()) / 2;
        if ((randomNumForSex == 1 && randomNum == 50) || randomNum > 50) {
            AllWomanName allWomanName = new AllWomanName();
            Woman woman = new Woman(feminine, family.getFather().getSurname(), "0/0/0", iq, null);
            family.addChild(woman);
        } else {
            AllManName allManName = new AllManName();
            Man man = new Man(masculine, family.getFather().getSurname(), "0/0/0", iq, null);
            family.addChild(man);
        }
        return this.familyDao.saveFamily(family);
    }

    public Family adoptChild(Family family, Human child) throws FileNotFoundException {
        family.addChild(child);
        return this.familyDao.saveFamily(family);
    }

    public void deleteAllChildrenOlderThen(int age) throws FileNotFoundException {
        int currentYear = date.getYear() + 1900;
        for (Family family : this.familyDao
                .getAllFamilies()
                .stream()
                .filter(family ->
                        family
                                .getChildren()
                                .removeIf(human -> (currentYear - human.getBirthDate()) > age))
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
        try {
            return this.familyDao.getAllFamilies().get(index).getPets().stream().toList();
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public void addPet(int index, Pet pet) throws FileNotFoundException {
        this.familyDao.getAllFamilies().get(index).getPets().add(pet);
        this.familyDao.saveFamily(this.familyDao.getAllFamilies().get(index));
    }

    public void loadData() throws Exception {
        familyDao.loadData();
    }

    public void saveData() throws IOException {
        familyDao.saveData();
    }
}
