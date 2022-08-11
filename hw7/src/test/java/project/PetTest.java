package project;


import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PetTest {
    @Test
    void equalsPetTest(){
        Pet pet=new Pet();
        Pet pet1=new Pet();
        boolean check=pet.equals(pet1);
        assertTrue(check);
    }
}
