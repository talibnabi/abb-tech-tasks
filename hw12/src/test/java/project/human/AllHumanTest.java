package project.human;

import org.testng.annotations.Test;
import project.model.human.Family;
import project.model.human.Human;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AllHumanTest {
    ;
    Human human;
    Human human1;

    @Test
    void hashCodeTest() {
        human = new Human();
        human.setName("Alisa");
        human.setSurname("Aslan");
        human.setIq(90);
        human.setSchedule(new HashMap<>());
        Family family = new Family(new Human(), new Human());
        human.setFamily(family);
        human1 = new Human();
        human1.setName("Alisa");
        human1.setSurname("Aslan");
        human1.setIq(90);
        human1.setSchedule(new HashMap<>());
        Family family2 = new Family(new Human(), new Human());
        human1.setFamily(family2);
        assertEquals(human1.hashCode(), human.hashCode());
    }

    @Test
    void equalsHumanTest() {
        human = new Human();
        Family family1 = new Family(new Human(), new Human());
        human.setFamily(family1);
        human1 = new Human();
        Family family2 = new Family(new Human(), new Human());
        human1.setFamily(family2);
        boolean check = human.equals(human1);
        assertTrue(check);
    }
}
