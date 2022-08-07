package project;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HumanTest {
    @Test
    void equalsHumanTest() {
        Family family = new Family(new Human(), new Human());
        Human human = new Human();
        human.setFamily(family);
        Human human1 = new Human();
        human1.setFamily(family);
        boolean check = human.equals(human1);
        assertTrue(check);
    }
}
