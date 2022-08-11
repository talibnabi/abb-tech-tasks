package project;


import org.testng.annotations.Test;
import project.allPet.Dog;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PetTest {
    @Test
    void equalsDogTest(){
        Dog dog=new Dog();
        Dog dog1=new Dog();
        boolean check=dog.equals(dog1);
        assertTrue(check);
    }
}
