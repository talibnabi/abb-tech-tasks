package family;

import alive.Human;
import alive.Pet;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class FamilyTest {
    @Test
    void feedPetTest() {
        var pet = new Pet();
        pet.setTrickLevel1(40);
        pet.setNickname("Alisa");
        var familyTest = new Family(new Human(), new Human());
        familyTest.setPet(pet);
        assertEquals(true, familyTest.feedPet(false));
    }

    @Test
    void countFamilyTest() {
        Human mother = new Human();
        mother.setName("Alisa");
        mother.setSurname("Aslan");

        Human father = new Human();
        father.setName("Salim");
        father.setSurname("Aslan");

        Human[] childArr = new Human[1];
        Human child = new Human();
        child.setName("Sahib");
        child.setSurname("Aslan");
        childArr[0] = child;
        var familyTest = new Family(mother, father);
        familyTest.setChildren(childArr);
        assertEquals(3, familyTest.countFamily());
    }

    @Test
    void deleteChildTest() {
        Family family = new Family(new Human(), new Human());
        Human child = new Human();
        child.setName("Narmina");
        child.setSurname("Aslan");
        family.addChild(child);
        boolean check=family.deleteChild(0);
        assertEquals(true,check);
    }
}
