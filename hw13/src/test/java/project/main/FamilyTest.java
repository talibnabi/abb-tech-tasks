package project.main;

import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.testng.annotations.Test;
import project.model.impl.human.Family;
import project.model.impl.human.Human;
import project.model.impl.human.Man;
import project.model.impl.human.Woman;
import project.model.impl.pet.Dog;
import project.model.inter.Pet;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class FamilyTest {
    Family family;
    Family family2;


    @Test
    void countFamilyTest() {
        Human mother = new Human();
        mother.setName("Alisa");
        mother.setSurname("Aslan");

        Human father = new Human();
        father.setName("Salim");
        father.setSurname("Aslan");
        List<Human> children = new ArrayList<>();
        Human child = new Human();
        child.setName("Sahib");
        child.setSurname("Aslan");
        children.add(child);
        var familyTest = new Family(mother, father);
        familyTest.setChildren(children);
        assertEquals(3, familyTest.countFamily());
    }

    @Test
    void deleteChildTest() throws ParseException {
        Man father = new Man("Anar", "Nasibov", "2001", 100,
                null);
        Woman mother = new Woman("Alisa", "Nasibov", "1999", 100,
                null);

        Dog dog = new Dog("Allahverdi", 2, 12, null);
        Set<Pet> pets = new HashSet<>();
        pets.add(dog);
        Family family1 = new Family(father, mother);
        List<Human> child = new ArrayList<>();
        family1.setChildren(child);
        family1.setPets(pets);
        family1 = Mockito.mock(Family.class);
        family1.deleteChild(0);
        Mockito.verify(family1).deleteChild(0);
    }

    @Test
    void deleteChildTest2() throws ParseException {
        Man father = new Man("Anar", "Nasibov", "2001", 100,
                null);
        Woman mother = new Woman("Alisa", "Nasibov", "1999", 100,
                null);

        Dog dog = new Dog("Allahverdi", 2, 12, null);
        Set<Pet> pets = new HashSet<>();
        pets.add(dog);
        Family family1 = new Family(father, mother);
        List<Human> child = new ArrayList<>();
        family1.setChildren(child);
        family1.setPets(pets);
        family1 = Mockito.mock(Family.class);
        Human human = null;
        for (Human human1 : child) {
            human = human1;
        }
        family1.deleteChild(human);
        Mockito.verify(family1).deleteChild(human);
    }

    @Test
    void addChildTest() throws ParseException {
        Man father = new Man("Anar", "Nasibov", "2001", 100,
                null);
        Woman mother = new Woman("Alisa", "Nasibov", "1999", 100,
                null);

        Family family1 = new Family(father, mother);
        List<Human> child = new ArrayList<>();
        family1.bornChild();
        Assertions.assertNotNull(child);
    }

    @Test
    void equalsFamilyTest() {
        Human mother = new Human();
        Human father = new Human();
        Family family = new Family(mother, father);
        Family family1 = new Family(mother, father);
        boolean check = family.equals(family1);
        assertTrue(check);
    }

    @Test
    void equalsTest() {
        assertEquals(family, family2);
    }

    @Test
    void hashCodeTest() {
        family=new Family(new Human(),new Human());
        family2 =new Family(new Human(),new Human());
        assertEquals(family.hashCode(), family2.hashCode());
    }
    @Test
    void feedPetTest(){
        family=new Family(new Human(),new Human());
        Set<Pet> pets=new HashSet<>();
        Pet pet=new Dog();
        pet.setAge(1);
        pet.setNickname("alisa");
        pet.setTrickLevel1(23);
        pets.add(pet);
        family.setPets(pets);
        assertTrue(family.feedPet(true));
    }
}
