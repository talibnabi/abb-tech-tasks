package project.main;


import project.allEnum.DayOfWeek;
import project.allHuman.Human;
import project.allPet.DomesticCat;
import project.allPet.Pet;
import project.dao.controller.FamilyController;
import project.dao.data.CollectionFamilyDao;
import project.dao.service.FamilyService;

import java.util.*;


public class Main {
    public static void main(String[] args) throws Throwable {
        FamilyController familyController = new FamilyController(new FamilyService(new CollectionFamilyDao()));
        Pet pet = new DomesticCat();
        pet.setNickname("Alisa");
        pet.setAge(2);
        pet.setTrickLevel1(89);
        Human mother = new Human();
        mother.setName("Narmin");
        mother.setSurname("Anar");
        mother.setIq(39);
        Human father = new Human();
        father.setName("Tural");
        father.setSurname("Anar");
        father.setIq(33);
        familyController.createNewFamily(mother, father);
        Human mother2 = new Human();
        mother2.setName("Narmin2");
        mother2.setSurname("Anar");
        mother2.setIq(59);
        Human father2 = new Human();
        father2.setName("Tural2");
        father2.setSurname("Anar");
        father2.setIq(35);
        familyController.createNewFamily(mother2, father2);
        Human mother3 = new Human();
        mother3.setName("Narmin3");
        mother3.setSurname("Anar");
        mother3.setIq(93);
        Human father3 = new Human();
        father3.setName("Tural3");
        father3.setSurname("Anar");
        father3.setIq(78);
        familyController.createNewFamily(mother3, father3);
        List<Family> families = familyController.getAllFamilies();
        for (Family family : families) {
            System.out.println(family);
        }
        Family family = familyController.bornChild(new Family(father, mother), "Alisa", "Alisa");
        System.out.println(family);

        System.out.println(familyController.getFamilyById(0));
        familyController.addPet(0, pet);
        System.out.println(familyController.getPets(0).get(0));
        System.out.println(familyController.countFamiliesWithMemberNumber(0));
        familyController.displayAllFamilies();
        familyController.deleteFamilyByIndex(0);
        familyController.displayAllFamilies();
        System.out.println(familyController.count());
//        humanEnumShow();
//        DomesticCat domesticCat = new DomesticCat();
//        domesticCat.setNickname("Alisa");
//        domesticCat.setAge(2);
//        Set<String> set = new HashSet<>();
//        set.add("Gym");
//        set.add("Swimming");
//        domesticCat.setHabits(set);
//        domesticCat.setTrickLevel1(89);
//        Man father = new Man("Ramos", "Sergio", 1997);
//        father.setIq(99);
//        Woman mother = new Woman("Jasmin", "Sergio", 1998);
//        mother.setIq(88);
//        Family family = new Family(father, mother);
//        Set<Pet> pets = new HashSet<>();
//        pets.add(domesticCat);
//        family.setPets(pets);
//        mother.makeup();
//        father.repairCar();
//        family.bornChild();
//        System.out.println(family.getChildren());
    }

    private static void humanEnumShow() {
        Human human = new Human();
        Map<String, String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.MONDAY.name(), "Go to gym");
        schedule.put(DayOfWeek.WEDNESDAY.name(), "Go to sport");
        for (String name : schedule.keySet()) {
            String key = name.toString();
            String value = schedule.get(name).toString();
            System.out.println(key + " " + value);
        }
    }

    private static void detectFinalize() throws Throwable {
        for (int i = 10000; i < 10000000; i++) {
            Human human = new Human();
        }
    }

}
