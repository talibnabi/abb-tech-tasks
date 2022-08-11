package family;


import org.testng.annotations.Test;
import project.main.Family;
import project.allHuman.Human;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FamilyTest {


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
        boolean check = family.deleteChild(0);
        assertTrue(check);
    }

    @Test
    void deleteChildTest2() {
        Family family = new Family(new Human(), new Human());
        Human child = new Human();
        child.setName("Narmina");
        child.setSurname("Aslan");
        family.addChild(child);
        boolean check = family.deleteChild(child);
        assertTrue(check);
    }

    @Test
    void addChildTest() {
        Family family = new Family(new Human(), new Human());
        Human child = new Human();
        child.setName("Narmina");
        child.setSurname("Aslan");
        boolean check = family.addChild(child);
        assertTrue(check);
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

}
