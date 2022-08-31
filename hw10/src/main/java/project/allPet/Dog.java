package project.allPet;

import project.allEnum.Species;

import java.util.List;
import java.util.Set;

public class Dog extends Pet implements Unpleasant {
    public Dog() {
        super.setSpecies(Species.DOG);
    }

    public Dog(String nickname) {
        super(nickname);
        super.setSpecies(Species.DOG);
    }

    public Dog(String nickname, Integer age, Integer trickLevel1, Set<String> habits) {
        super(nickname, age, trickLevel1, habits);
        super.setSpecies(Species.DOG);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am " + getNickname() + ". I miss you!");
    }


    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }
}
