package project.pet;

import org.testng.annotations.Test;
import project.model.pet.Dog;
import project.model.pet.Pet;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AllPetTest {
    Pet pet;
    Pet pet1;

    @Test
    void hashCodeTest() {
        pet = new Dog();
        pet.setTrickLevel1(90);
        pet.setAge(2);
        pet.setNickname("Alisa");
        pet.setHabits(new HashSet<>());
        pet1 = new Dog();
        pet1.setTrickLevel1(90);
        pet1.setAge(2);
        pet1.setNickname("Alisa");
        pet1.setHabits(new HashSet<>());
        assertEquals(pet.hashCode(), pet1.hashCode());
    }

    @Test
    void equalsHumanTest() {
        pet = new Dog();
        pet1 = new Dog();
        boolean check = pet.equals(pet1);
        assertTrue(check);
    }
}
