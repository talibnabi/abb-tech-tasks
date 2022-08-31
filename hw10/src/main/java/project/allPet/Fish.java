package project.allPet;

import project.allEnum.Species;

import java.util.List;
import java.util.Set;

public class Fish extends Pet {
    public Fish() {
        super.setSpecies(Species.FISH);
    }

    public Fish(String nickname) {
        super(nickname);
        super.setSpecies(Species.FISH);
    }

    public Fish(String nickname, Integer age, Integer trickLevel1, Set<String> habits) {
        super(nickname, age, trickLevel1, habits);
        super.setSpecies(Species.FISH);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am " + getNickname() + ". I miss you!");
    }

}
